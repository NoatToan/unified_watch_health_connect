package com.huami.ecg.core.model;

import com.alipay.sdk.m.f0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/huami/ecg/core/model/EcgAnalysisStatus;", "", "<init>", "()V", "Analysising", "FAIL", "NotAnalysis", c.p, "Lcom/huami/ecg/core/model/EcgAnalysisStatus$NotAnalysis;", "Lcom/huami/ecg/core/model/EcgAnalysisStatus$Analysising;", "Lcom/huami/ecg/core/model/EcgAnalysisStatus$SUCCESS;", "Lcom/huami/ecg/core/model/EcgAnalysisStatus$FAIL;", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public abstract class EcgAnalysisStatus {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/ecg/core/model/EcgAnalysisStatus$Analysising;", "Lcom/huami/ecg/core/model/EcgAnalysisStatus;", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class Analysising extends EcgAnalysisStatus {
        public static final Analysising INSTANCE = new Analysising();

        private Analysising() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/ecg/core/model/EcgAnalysisStatus$FAIL;", "Lcom/huami/ecg/core/model/EcgAnalysisStatus;", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class FAIL extends EcgAnalysisStatus {
        public static final FAIL INSTANCE = new FAIL();

        private FAIL() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/ecg/core/model/EcgAnalysisStatus$NotAnalysis;", "Lcom/huami/ecg/core/model/EcgAnalysisStatus;", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class NotAnalysis extends EcgAnalysisStatus {
        public static final NotAnalysis INSTANCE = new NotAnalysis();

        private NotAnalysis() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/ecg/core/model/EcgAnalysisStatus$SUCCESS;", "Lcom/huami/ecg/core/model/EcgAnalysisStatus;", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class SUCCESS extends EcgAnalysisStatus {
        public static final SUCCESS INSTANCE = new SUCCESS();

        private SUCCESS() {
            super(null);
        }
    }

    private EcgAnalysisStatus() {
    }

    public /* synthetic */ EcgAnalysisStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
