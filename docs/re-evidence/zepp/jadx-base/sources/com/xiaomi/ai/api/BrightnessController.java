package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import org.cybergarage.upnp.std.av.renderer.RenderingControl;

/* JADX INFO: loaded from: classes18.dex */
public class BrightnessController {

    @NamespaceName(name = "AdjustBrightness", namespace = AIApiConstants.BrightnessController.NAME)
    public static class AdjustBrightness implements InstructionPayload {

        @Required
        private int brightness_delta;

        public AdjustBrightness() {
        }

        public AdjustBrightness(int i) {
            this.brightness_delta = i;
        }

        @Required
        public int getBrightnessDelta() {
            return this.brightness_delta;
        }

        @Required
        public AdjustBrightness setBrightnessDelta(int i) {
            this.brightness_delta = i;
            return this;
        }
    }

    @NamespaceName(name = RenderingControl.SETBRIGHTNESS, namespace = AIApiConstants.BrightnessController.NAME)
    public static class SetBrightness implements InstructionPayload {

        @Required
        private int brightness;

        public SetBrightness() {
        }

        public SetBrightness(int i) {
            this.brightness = i;
        }

        @Required
        public int getBrightness() {
            return this.brightness;
        }

        @Required
        public SetBrightness setBrightness(int i) {
            this.brightness = i;
            return this;
        }
    }
}
