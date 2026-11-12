package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ChannelController {

    @NamespaceName(name = "ChangeTVChannel", namespace = AIApiConstants.ChannelController.NAME)
    public static class ChangeTVChannel implements InstructionPayload {
        private Optional<Integer> num = Optional.a();
        private Optional<List<String>> candidates = Optional.a();
        private Optional<ChangeTVChannelOp> operation = Optional.a();
        private Optional<String> standard_channel = Optional.a();
        private Optional<Long> atv_id = Optional.a();

        public Optional<Long> getAtvId() {
            return this.atv_id;
        }

        public Optional<List<String>> getCandidates() {
            return this.candidates;
        }

        public Optional<Integer> getNum() {
            return this.num;
        }

        public Optional<ChangeTVChannelOp> getOperation() {
            return this.operation;
        }

        public Optional<String> getStandardChannel() {
            return this.standard_channel;
        }

        public ChangeTVChannel setAtvId(long j) {
            this.atv_id = Optional.e(Long.valueOf(j));
            return this;
        }

        public ChangeTVChannel setCandidates(List<String> list) {
            this.candidates = Optional.e(list);
            return this;
        }

        public ChangeTVChannel setNum(int i) {
            this.num = Optional.e(Integer.valueOf(i));
            return this;
        }

        public ChangeTVChannel setOperation(ChangeTVChannelOp changeTVChannelOp) {
            this.operation = Optional.e(changeTVChannelOp);
            return this;
        }

        public ChangeTVChannel setStandardChannel(String str) {
            this.standard_channel = Optional.e(str);
            return this;
        }
    }

    public enum ChangeTVChannelOp {
        UNKNOWN(-1),
        PREV(0),
        NEXT(1),
        RETURN(2);

        private int id;

        ChangeTVChannelOp(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TVChannelMode {
        UNKNOWN(-1),
        STB(0),
        ATV(1);

        private int id;

        TVChannelMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TVChannelStatus {
        UNKNOWN(-1),
        PLAYING(0);

        private int id;

        TVChannelStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "ChangeRadioChannel", namespace = AIApiConstants.ChannelController.NAME)
    public static class ChangeRadioChannel implements InstructionPayload {

        @Required
        private List<RadioItem> candidates;
        private Optional<String> keyword = Optional.a();

        public ChangeRadioChannel() {
        }

        @Required
        public List<RadioItem> getCandidates() {
            return this.candidates;
        }

        public Optional<String> getKeyword() {
            return this.keyword;
        }

        @Required
        public ChangeRadioChannel setCandidates(List<RadioItem> list) {
            this.candidates = list;
            return this;
        }

        public ChangeRadioChannel setKeyword(String str) {
            this.keyword = Optional.e(str);
            return this;
        }

        public ChangeRadioChannel(List<RadioItem> list) {
            this.candidates = list;
        }
    }

    public static class RadioItem {

        @Required
        private String frequency;

        @Required
        private String name;
        private Optional<AudioPlayer.Stream> stream = Optional.a();

        public RadioItem() {
        }

        @Required
        public String getFrequency() {
            return this.frequency;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<AudioPlayer.Stream> getStream() {
            return this.stream;
        }

        @Required
        public RadioItem setFrequency(String str) {
            this.frequency = str;
            return this;
        }

        @Required
        public RadioItem setName(String str) {
            this.name = str;
            return this;
        }

        public RadioItem setStream(AudioPlayer.Stream stream) {
            this.stream = Optional.e(stream);
            return this;
        }

        public RadioItem(String str, String str2) {
            this.name = str;
            this.frequency = str2;
        }
    }

    @NamespaceName(name = "TVChannelState", namespace = AIApiConstants.ChannelController.NAME)
    public static class TVChannelState implements ContextPayload {

        @Required
        private TVChannelMode mode;
        private Optional<TVChannelStatus> status = Optional.a();

        public TVChannelState() {
        }

        @Required
        public TVChannelMode getMode() {
            return this.mode;
        }

        public Optional<TVChannelStatus> getStatus() {
            return this.status;
        }

        @Required
        public TVChannelState setMode(TVChannelMode tVChannelMode) {
            this.mode = tVChannelMode;
            return this;
        }

        public TVChannelState setStatus(TVChannelStatus tVChannelStatus) {
            this.status = Optional.e(tVChannelStatus);
            return this;
        }

        public TVChannelState(TVChannelMode tVChannelMode) {
            this.mode = tVChannelMode;
        }
    }
}
