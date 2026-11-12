package com.huami.ecg.core.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u000b¨\u0006\f"}, d2 = {"Lcom/huami/ecg/core/model/EcgWebUrlKey;", "", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "<init>", "(Ljava/lang/String;)V", "ZeppEcgAnalysis", "Lcom/huami/ecg/core/model/EcgWebUrlKey$ZeppEcgAnalysis;", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public abstract class EcgWebUrlKey {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String key;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/ecg/core/model/EcgWebUrlKey$ZeppEcgAnalysis;", "Lcom/huami/ecg/core/model/EcgWebUrlKey;", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class ZeppEcgAnalysis extends EcgWebUrlKey {
        public static final ZeppEcgAnalysis INSTANCE = new ZeppEcgAnalysis();

        private ZeppEcgAnalysis() {
            super("zepp.h5.url", null);
        }
    }

    private EcgWebUrlKey(String str) {
        this.key = str;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public /* synthetic */ EcgWebUrlKey(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
