package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ApplicationSettings {

    @NamespaceName(name = "ManageMenstrual", namespace = AIApiConstants.ApplicationSettings.NAME)
    public static class ManageMenstrual implements InstructionPayload {

        @Required
        private MenstrualPeriod item;

        @Required
        private MenstruationOperationType operation_type;

        public ManageMenstrual() {
        }

        public ManageMenstrual(MenstruationOperationType menstruationOperationType, MenstrualPeriod menstrualPeriod) {
            this.operation_type = menstruationOperationType;
            this.item = menstrualPeriod;
        }

        @Required
        public MenstrualPeriod getItem() {
            return this.item;
        }

        @Required
        public MenstruationOperationType getOperationType() {
            return this.operation_type;
        }

        @Required
        public ManageMenstrual setItem(MenstrualPeriod menstrualPeriod) {
            this.item = menstrualPeriod;
            return this;
        }

        @Required
        public ManageMenstrual setOperationType(MenstruationOperationType menstruationOperationType) {
            this.operation_type = menstruationOperationType;
            return this;
        }
    }

    public static class MenstrualPeriod {
        private Optional<MenstrualPeriodInfo> start = Optional.a();
        private Optional<MenstrualPeriodInfo> end = Optional.a();

        public Optional<MenstrualPeriodInfo> getEnd() {
            return this.end;
        }

        public Optional<MenstrualPeriodInfo> getStart() {
            return this.start;
        }

        public MenstrualPeriod setEnd(MenstrualPeriodInfo menstrualPeriodInfo) {
            this.end = Optional.e(menstrualPeriodInfo);
            return this;
        }

        public MenstrualPeriod setStart(MenstrualPeriodInfo menstrualPeriodInfo) {
            this.start = Optional.e(menstrualPeriodInfo);
            return this;
        }
    }

    public static class MenstrualPeriodInfo {
        private Optional<Long> timestamp = Optional.a();
        private Optional<MenstrualPeriodTimeType> type = Optional.a();

        public Optional<Long> getTimestamp() {
            return this.timestamp;
        }

        public Optional<MenstrualPeriodTimeType> getType() {
            return this.type;
        }

        public MenstrualPeriodInfo setTimestamp(long j) {
            this.timestamp = Optional.e(Long.valueOf(j));
            return this;
        }

        public MenstrualPeriodInfo setType(MenstrualPeriodTimeType menstrualPeriodTimeType) {
            this.type = Optional.e(menstrualPeriodTimeType);
            return this;
        }
    }

    public enum MenstrualPeriodTimeType {
        UNKNOWN(-1),
        RECORD(0),
        PREDICTION(1);

        private int id;

        MenstrualPeriodTimeType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum MenstruationOperationType {
        UNKNOWN(-1),
        SETTING(0),
        RECORD_QUERY(1),
        PERIOD_PREDICTION(2),
        RECORD_PREDICTION_QUERY(3);

        private int id;

        MenstruationOperationType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "MenstruationState", namespace = AIApiConstants.ApplicationSettings.NAME)
    public static class MenstruationState implements EventPayload {

        @Required
        private MenstruationOperationType operation_type;

        @Required
        private int status_code;
        private Optional<List<MenstrualPeriod>> menstrual_period_records = Optional.a();
        private Optional<List<MenstrualPeriod>> menstrual_period_predict = Optional.a();

        public MenstruationState() {
        }

        public Optional<List<MenstrualPeriod>> getMenstrualPeriodPredict() {
            return this.menstrual_period_predict;
        }

        public Optional<List<MenstrualPeriod>> getMenstrualPeriodRecords() {
            return this.menstrual_period_records;
        }

        @Required
        public MenstruationOperationType getOperationType() {
            return this.operation_type;
        }

        @Required
        public int getStatusCode() {
            return this.status_code;
        }

        public MenstruationState setMenstrualPeriodPredict(List<MenstrualPeriod> list) {
            this.menstrual_period_predict = Optional.e(list);
            return this;
        }

        public MenstruationState setMenstrualPeriodRecords(List<MenstrualPeriod> list) {
            this.menstrual_period_records = Optional.e(list);
            return this;
        }

        @Required
        public MenstruationState setOperationType(MenstruationOperationType menstruationOperationType) {
            this.operation_type = menstruationOperationType;
            return this;
        }

        @Required
        public MenstruationState setStatusCode(int i) {
            this.status_code = i;
            return this;
        }

        public MenstruationState(int i, MenstruationOperationType menstruationOperationType) {
            this.status_code = i;
            this.operation_type = menstruationOperationType;
        }
    }
}
