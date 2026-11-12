package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes6.dex */
public class PushTemplate {

    @NamespaceName(name = "GeneralPush", namespace = AIApiConstants.PushTemplate.NAME)
    public static class GeneralPush implements InstructionPayload {
        private Optional<Template.Title> title = Optional.a();
        private Optional<String> content = Optional.a();
        private Optional<Template.Image> icon = Optional.a();

        public Optional<String> getContent() {
            return this.content;
        }

        public Optional<Template.Image> getIcon() {
            return this.icon;
        }

        public Optional<Template.Title> getTitle() {
            return this.title;
        }

        public GeneralPush setContent(String str) {
            this.content = Optional.e(str);
            return this;
        }

        public GeneralPush setIcon(Template.Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        public GeneralPush setTitle(Template.Title title) {
            this.title = Optional.e(title);
            return this;
        }
    }
}
