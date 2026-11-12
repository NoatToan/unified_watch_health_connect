package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes6.dex */
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

    @NamespaceName(name = "SetBrightness", namespace = AIApiConstants.BrightnessController.NAME)
    public static class SetBrightness implements InstructionPayload {

        @Required
        private int brightness;
        private Optional<Integer> key_backlight = Optional.a();
        private Optional<Integer> instrument_panel = Optional.a();

        public SetBrightness() {
        }

        @Required
        public int getBrightness() {
            return this.brightness;
        }

        public Optional<Integer> getInstrumentPanel() {
            return this.instrument_panel;
        }

        public Optional<Integer> getKeyBacklight() {
            return this.key_backlight;
        }

        @Required
        public SetBrightness setBrightness(int i) {
            this.brightness = i;
            return this;
        }

        public SetBrightness setInstrumentPanel(int i) {
            this.instrument_panel = Optional.e(Integer.valueOf(i));
            return this;
        }

        public SetBrightness setKeyBacklight(int i) {
            this.key_backlight = Optional.e(Integer.valueOf(i));
            return this;
        }

        public SetBrightness(int i) {
            this.brightness = i;
        }
    }
}
