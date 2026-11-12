package com.huami.watch.companion.ecg.util;

import com.huami.watch.companion.cloud.Cloud;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/huami/watch/companion/ecg/util/EcgHelpType;", "", "", "a", "Ljava/lang/String;", "getNormalUrl", "()Ljava/lang/String;", "normalUrl", "<init>", "(Ljava/lang/String;)V", "Afib", "Hrv", "Risk", "Strength", "Lcom/huami/watch/companion/ecg/util/EcgHelpType$Hrv;", "Lcom/huami/watch/companion/ecg/util/EcgHelpType$Strength;", "Lcom/huami/watch/companion/ecg/util/EcgHelpType$Risk;", "Lcom/huami/watch/companion/ecg/util/EcgHelpType$Afib;", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public abstract class EcgHelpType {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String normalUrl;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/watch/companion/ecg/util/EcgHelpType$Afib;", "Lcom/huami/watch/companion/ecg/util/EcgHelpType;", "<init>", "()V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Afib extends EcgHelpType {

        @NotNull
        public static final Afib INSTANCE = new Afib();

        private Afib() {
            super(Cloud.urlEcgHelp(33), null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/watch/companion/ecg/util/EcgHelpType$Hrv;", "Lcom/huami/watch/companion/ecg/util/EcgHelpType;", "<init>", "()V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Hrv extends EcgHelpType {

        @NotNull
        public static final Hrv INSTANCE = new Hrv();

        private Hrv() {
            super(Cloud.urlEcgHelp(24), null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/watch/companion/ecg/util/EcgHelpType$Risk;", "Lcom/huami/watch/companion/ecg/util/EcgHelpType;", "<init>", "()V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Risk extends EcgHelpType {

        @NotNull
        public static final Risk INSTANCE = new Risk();

        private Risk() {
            super(Cloud.urlEcgHelp(26), null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/watch/companion/ecg/util/EcgHelpType$Strength;", "Lcom/huami/watch/companion/ecg/util/EcgHelpType;", "<init>", "()V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Strength extends EcgHelpType {

        @NotNull
        public static final Strength INSTANCE = new Strength();

        private Strength() {
            super(Cloud.urlEcgHelp(25), null);
        }
    }

    private EcgHelpType(String str) {
        this.normalUrl = str;
    }

    public /* synthetic */ EcgHelpType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getNormalUrl() {
        return this.normalUrl;
    }
}
