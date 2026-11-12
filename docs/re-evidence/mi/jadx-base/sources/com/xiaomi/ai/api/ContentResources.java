package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes6.dex */
public class ContentResources {

    public enum ResourceQualifier {
        UNKNOWN(-1),
        SUBSCRIBED(0),
        PURCHASED(1);

        private int id;

        ResourceQualifier(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ResourceType {
        UNKNOWN(-1),
        ALBUM(0);

        private int id;

        ResourceType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "Subscribe", namespace = AIApiConstants.ContentResources.NAME)
    public static class Subscribe implements InstructionPayload {

        @Required
        private ResourceType resource_type;

        public Subscribe() {
        }

        public Subscribe(ResourceType resourceType) {
            this.resource_type = resourceType;
        }

        @Required
        public ResourceType getResourceType() {
            return this.resource_type;
        }

        @Required
        public Subscribe setResourceType(ResourceType resourceType) {
            this.resource_type = resourceType;
            return this;
        }
    }

    @NamespaceName(name = "UnSubscribe", namespace = AIApiConstants.ContentResources.NAME)
    public static class UnSubscribe implements InstructionPayload {

        @Required
        private ResourceType resource_type;

        public UnSubscribe() {
        }

        public UnSubscribe(ResourceType resourceType) {
            this.resource_type = resourceType;
        }

        @Required
        public ResourceType getResourceType() {
            return this.resource_type;
        }

        @Required
        public UnSubscribe setResourceType(ResourceType resourceType) {
            this.resource_type = resourceType;
            return this;
        }
    }

    @NamespaceName(name = "Play", namespace = AIApiConstants.ContentResources.NAME)
    public static class Play implements InstructionPayload {
        private Optional<ResourceQualifier> resource_qualifier = Optional.a();

        @Required
        private ResourceType resource_type;

        public Play() {
        }

        public Optional<ResourceQualifier> getResourceQualifier() {
            return this.resource_qualifier;
        }

        @Required
        public ResourceType getResourceType() {
            return this.resource_type;
        }

        public Play setResourceQualifier(ResourceQualifier resourceQualifier) {
            this.resource_qualifier = Optional.e(resourceQualifier);
            return this;
        }

        @Required
        public Play setResourceType(ResourceType resourceType) {
            this.resource_type = resourceType;
            return this;
        }

        public Play(ResourceType resourceType) {
            this.resource_type = resourceType;
        }
    }
}
