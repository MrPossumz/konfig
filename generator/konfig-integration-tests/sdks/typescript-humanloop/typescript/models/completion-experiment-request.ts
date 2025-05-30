/*
Humanloop API

The Humanloop API allows you to interact with Humanloop from your product or service.

You can do this through HTTP requests from any language or via our official Python or TypeScript SDK.

To install the official [Python SDK](https://pypi.org/project/humanloop/), run the following command:

```bash
pip install humanloop
```

To install the official [TypeScript SDK](https://www.npmjs.com/package/humanloop), run the following command:

```bash
npm i humanloop
```

---

Guides and further details about key concepts can be found in [our docs](https://docs.humanloop.com/).

The version of the OpenAPI document: 4.0.1


NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/
import type * as buffer from "buffer"

import { ProviderApiKeys } from './provider-api-keys';

/**
 * Completion request for a specific experiment.
 * @export
 * @interface CompletionExperimentRequest
 */
export interface CompletionExperimentRequest {
    /**
     * Unique project name. If no project exists with this name, a new project will be created.
     * @type {string}
     * @memberof CompletionExperimentRequest
     */
    'project'?: string;
    /**
     * Unique ID of a project to associate to the log. Either this or `project` must be provided.
     * @type {string}
     * @memberof CompletionExperimentRequest
     */
    'project_id'?: string;
    /**
     * ID of the session to associate the datapoint.
     * @type {string}
     * @memberof CompletionExperimentRequest
     */
    'session_id'?: string;
    /**
     * A unique string identifying the session to associate the datapoint to. Allows you to log multiple datapoints to a session (using an ID kept by your internal systems) by passing the same `session_reference_id` in subsequent log requests. Specify at most one of this or `session_id`.
     * @type {string}
     * @memberof CompletionExperimentRequest
     */
    'session_reference_id'?: string;
    /**
     * ID associated to the parent datapoint in a session.
     * @type {string}
     * @memberof CompletionExperimentRequest
     */
    'parent_id'?: string;
    /**
     * A unique string identifying the previously-logged parent datapoint in a session. Allows you to log nested datapoints with your internal system IDs by passing the same reference ID as `parent_id` in a prior log request. Specify at most one of this or `parent_id`. Note that this cannot refer to a datapoint being logged in the same request.
     * @type {string}
     * @memberof CompletionExperimentRequest
     */
    'parent_reference_id'?: string;
    /**
     * The inputs passed to the prompt template.
     * @type {object}
     * @memberof CompletionExperimentRequest
     */
    'inputs'?: object;
    /**
     * Identifies where the model was called from.
     * @type {string}
     * @memberof CompletionExperimentRequest
     */
    'source'?: string;
    /**
     * Any additional metadata to record.
     * @type {object}
     * @memberof CompletionExperimentRequest
     */
    'metadata'?: object;
    /**
     * ID of the source datapoint if this is a log derived from a datapoint in a dataset.
     * @type {string}
     * @memberof CompletionExperimentRequest
     */
    'source_datapoint_id'?: string;
    /**
     * API keys required by each provider to make API calls. The API keys provided here are not stored by Humanloop. If not specified here, Humanloop will fall back to the key saved to your organization.
     * @type {ProviderApiKeys}
     * @memberof CompletionExperimentRequest
     */
    'provider_api_keys'?: ProviderApiKeys;
    /**
     * The number of chat responses, where each chat response will use a model configuration sampled from the experiment.
     * @type {number}
     * @memberof CompletionExperimentRequest
     */
    'num_samples'?: number;
    /**
     * Include the log probabilities of the top n tokens in the provider_response
     * @type {number}
     * @memberof CompletionExperimentRequest
     */
    'logprobs'?: number;
    /**
     * If true, tokens will be sent as data-only server-sent events. If num_samples > 1, samples are streamed back independently.
     * @type {boolean}
     * @memberof CompletionExperimentRequest
     */
    'stream'?: boolean;
    /**
     * The suffix that comes after a completion of inserted text. Useful for completions that act like inserts.
     * @type {string}
     * @memberof CompletionExperimentRequest
     */
    'suffix'?: string;
    /**
     * If specified, model will make a best effort to sample deterministically, but it is not guaranteed.
     * @type {number}
     * @memberof CompletionExperimentRequest
     */
    'seed'?: number;
    /**
     * End-user ID passed through to provider call.
     * @type {string}
     * @memberof CompletionExperimentRequest
     */
    'user'?: string;
    /**
     * If an experiment ID is provided a model configuration will be sampled from the experiments active model configurations.
     * @type {string}
     * @memberof CompletionExperimentRequest
     */
    'experiment_id': string;
}

