package com.huami.phn.core.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00102\u00020\u0001:\u0006\u0010\u0011\u0012\u0013\u0014\u0015B\u0019\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0005\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/huami/phn/core/model/RecommendState;", "", "", "a", LogUtil.I, "getValue", "()I", "value", "", "b", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "desc", "<init>", "(ILjava/lang/String;)V", "Companion", "DailyFull", "DailyGo", "Rest", "Tired", "WeeklyFull", "Lcom/huami/phn/core/model/RecommendState$Rest;", "Lcom/huami/phn/core/model/RecommendState$Tired;", "Lcom/huami/phn/core/model/RecommendState$WeeklyFull;", "Lcom/huami/phn/core/model/RecommendState$DailyFull;", "Lcom/huami/phn/core/model/RecommendState$DailyGo;", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public abstract class RecommendState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String desc;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0007¨\u0006\u0007"}, d2 = {"Lcom/huami/phn/core/model/RecommendState$Companion;", "", "", "Lcom/huami/phn/core/model/RecommendState;", "toRecommendState", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final RecommendState toRecommendState(int i) {
            Object next;
            Iterator it2 = CollectionsKt__CollectionsKt.listOf((Object[]) new RecommendState[]{Rest.INSTANCE, Tired.INSTANCE, WeeklyFull.INSTANCE, DailyFull.INSTANCE, DailyGo.INSTANCE}).iterator();
            while (it2.hasNext()) {
                next = it2.next();
                if (((RecommendState) next).getValue() == i) {
                    return (RecommendState) next;
                }
            }
            next = null;
            return (RecommendState) next;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/phn/core/model/RecommendState$DailyFull;", "Lcom/huami/phn/core/model/RecommendState;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class DailyFull extends RecommendState {

        @NotNull
        public static final DailyFull INSTANCE = new DailyFull();

        private DailyFull() {
            super(6, "每日计划已完成", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/phn/core/model/RecommendState$DailyGo;", "Lcom/huami/phn/core/model/RecommendState;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class DailyGo extends RecommendState {

        @NotNull
        public static final DailyGo INSTANCE = new DailyGo();

        private DailyGo() {
            super(7, "每日计划进行中", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/phn/core/model/RecommendState$Rest;", "Lcom/huami/phn/core/model/RecommendState;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class Rest extends RecommendState {

        @NotNull
        public static final Rest INSTANCE = new Rest();

        private Rest() {
            super(3, "休息日", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/phn/core/model/RecommendState$Tired;", "Lcom/huami/phn/core/model/RecommendState;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class Tired extends RecommendState {

        @NotNull
        public static final Tired INSTANCE = new Tired();

        private Tired() {
            super(4, "疲劳休息，训练超量", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/phn/core/model/RecommendState$WeeklyFull;", "Lcom/huami/phn/core/model/RecommendState;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class WeeklyFull extends RecommendState {

        @NotNull
        public static final WeeklyFull INSTANCE = new WeeklyFull();

        private WeeklyFull() {
            super(5, "周计划已完成", null);
        }
    }

    private RecommendState(int i, String str) {
        this.value = i;
        this.desc = str;
    }

    public /* synthetic */ RecommendState(int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }

    @JvmStatic
    @Nullable
    public static final RecommendState toRecommendState(int i) {
        return INSTANCE.toRecommendState(i);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final int getValue() {
        return this.value;
    }
}
