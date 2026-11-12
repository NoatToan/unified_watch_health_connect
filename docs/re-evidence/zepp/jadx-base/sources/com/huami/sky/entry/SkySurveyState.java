package com.huami.sky.entry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huami/sky/entry/SkySurveyState;", "", "<init>", "()V", "ExitPlayerPage", "ExitSurveyPage", "NoneState", "Lcom/huami/sky/entry/SkySurveyState$NoneState;", "Lcom/huami/sky/entry/SkySurveyState$ExitPlayerPage;", "Lcom/huami/sky/entry/SkySurveyState$ExitSurveyPage;", "sky-service_release"}, k = 1, mv = {1, 5, 1})
public abstract class SkySurveyState {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/huami/sky/entry/SkySurveyState$ExitPlayerPage;", "Lcom/huami/sky/entry/SkySurveyState;", "", "component1", "sourceFrom", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getSourceFrom", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "sky-service_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class ExitPlayerPage extends SkySurveyState {

        @NotNull
        private final String sourceFrom;

        public ExitPlayerPage(@NotNull String str) {
            super(null);
            this.sourceFrom = str;
        }

        public static /* synthetic */ ExitPlayerPage copy$default(ExitPlayerPage exitPlayerPage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = exitPlayerPage.sourceFrom;
            }
            return exitPlayerPage.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSourceFrom() {
            return this.sourceFrom;
        }

        @NotNull
        public final ExitPlayerPage copy(@NotNull String sourceFrom) {
            return new ExitPlayerPage(sourceFrom);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExitPlayerPage) && Intrinsics.areEqual(this.sourceFrom, ((ExitPlayerPage) other).sourceFrom);
        }

        @NotNull
        public final String getSourceFrom() {
            return this.sourceFrom;
        }

        public int hashCode() {
            return this.sourceFrom.hashCode();
        }

        @NotNull
        public String toString() {
            return "ExitPlayerPage(sourceFrom=" + this.sourceFrom + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/sky/entry/SkySurveyState$ExitSurveyPage;", "Lcom/huami/sky/entry/SkySurveyState;", "<init>", "()V", "sky-service_release"}, k = 1, mv = {1, 5, 1})
    public static final class ExitSurveyPage extends SkySurveyState {

        @NotNull
        public static final ExitSurveyPage INSTANCE = new ExitSurveyPage();

        private ExitSurveyPage() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/sky/entry/SkySurveyState$NoneState;", "Lcom/huami/sky/entry/SkySurveyState;", "<init>", "()V", "sky-service_release"}, k = 1, mv = {1, 5, 1})
    public static final class NoneState extends SkySurveyState {

        @NotNull
        public static final NoneState INSTANCE = new NoneState();

        private NoneState() {
            super(null);
        }
    }

    private SkySurveyState() {
    }

    public /* synthetic */ SkySurveyState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
