package com.xiaomi.fitness.training_plan.ability_plan;

import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.training_plan_export.model.Question;
import com.xiaomi.fitness.training_plan_export.model.QuestionOption;
import defpackage.k1j;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0005H\u0086@¢\u0006\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityQuestionModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "getQuestionInfo", "Lkotlin/Pair;", "", "", "Lcom/xiaomi/fitness/training_plan_export/model/Question;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AbilityQuestionModel extends BaseModel {

    @NotNull
    private static final String TAG = "AbilityQuestionModel";

    public AbilityQuestionModel() {
        Logger.d(TAG, "init AbilityQuestionModel");
    }

    @Nullable
    public final Object getQuestionInfo(@NotNull Continuation<? super Pair<Boolean, ? extends List<Question>>> continuation) {
        String string = ResourceExtKt.getString(k1j.a0);
        Boolean boolBoxBoolean = Boxing.boxBoolean(true);
        Question question = new Question(1, "improve_distance", k1j.b0, k1j.c0, CollectionsKt__CollectionsKt.listOf((Object[]) new QuestionOption[]{new QuestionOption(1, ResourceExtKt.getString(k1j.n), Boxing.boxBoolean(true), null, 8, null), new QuestionOption(2, ResourceExtKt.getString(k1j.o), Boxing.boxBoolean(false), null, 8, null)}));
        Question question2 = new Question(2, "running_frequency", k1j.f0, k1j.g0, CollectionsKt__CollectionsKt.listOf((Object[]) new QuestionOption[]{new QuestionOption(1, ResourceExtKt.getString(k1j.e0), Boxing.boxBoolean(true), ResourceExtKt.getString(k1j.g0)), new QuestionOption(2, ResourceExtKt.getString(k1j.k0), Boxing.boxBoolean(false), ResourceExtKt.getString(k1j.h0)), new QuestionOption(3, ResourceExtKt.getString(k1j.l0), Boxing.boxBoolean(false), ResourceExtKt.getString(k1j.i0)), new QuestionOption(4, ResourceExtKt.getString(k1j.d0), Boxing.boxBoolean(false), ResourceExtKt.getString(k1j.j0))}));
        Question question3 = new Question(3, "running_distance", k1j.N, k1j.O, CollectionsKt__CollectionsKt.listOf((Object[]) new QuestionOption[]{new QuestionOption(1, ResourceExtKt.getString(k1j.J), Boxing.boxBoolean(true), ResourceExtKt.getString(k1j.O)), new QuestionOption(2, ResourceExtKt.getString(k1j.K), Boxing.boxBoolean(false), ResourceExtKt.getString(k1j.P)), new QuestionOption(3, ResourceExtKt.getString(k1j.L), Boxing.boxBoolean(false), ResourceExtKt.getString(k1j.Q)), new QuestionOption(4, ResourceExtKt.getString(k1j.M), Boxing.boxBoolean(false), ResourceExtKt.getString(k1j.R))}));
        int i = k1j.W;
        int i2 = k1j.Z;
        QuestionOption questionOption = new QuestionOption(1, ResourceExtKt.getString(k1j.X), Boxing.boxBoolean(true), null, 8, null);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(string, Arrays.copyOf(new Object[]{Boxing.boxInt(3), Boxing.boxInt(0)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String str2 = String.format(string, Arrays.copyOf(new Object[]{Boxing.boxInt(3), Boxing.boxInt(59)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        QuestionOption questionOption2 = new QuestionOption(2, str + "-" + str2, Boxing.boxBoolean(false), null, 8, null);
        String str3 = String.format(string, Arrays.copyOf(new Object[]{Boxing.boxInt(4), Boxing.boxInt(0)}, 2));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        String str4 = String.format(string, Arrays.copyOf(new Object[]{Boxing.boxInt(4), Boxing.boxInt(59)}, 2));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        QuestionOption questionOption3 = new QuestionOption(3, str3 + "-" + str4, Boxing.boxBoolean(false), null, 8, null);
        String str5 = String.format(string, Arrays.copyOf(new Object[]{Boxing.boxInt(5), Boxing.boxInt(0)}, 2));
        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
        String str6 = String.format(string, Arrays.copyOf(new Object[]{Boxing.boxInt(5), Boxing.boxInt(59)}, 2));
        Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
        QuestionOption questionOption4 = new QuestionOption(4, str5 + "-" + str6, Boxing.boxBoolean(false), null, 8, null);
        String str7 = String.format(string, Arrays.copyOf(new Object[]{Boxing.boxInt(6), Boxing.boxInt(0)}, 2));
        Intrinsics.checkNotNullExpressionValue(str7, "format(...)");
        String str8 = String.format(string, Arrays.copyOf(new Object[]{Boxing.boxInt(6), Boxing.boxInt(59)}, 2));
        Intrinsics.checkNotNullExpressionValue(str8, "format(...)");
        QuestionOption questionOption5 = new QuestionOption(5, str7 + "-" + str8, Boxing.boxBoolean(false), null, 8, null);
        String str9 = String.format(string, Arrays.copyOf(new Object[]{Boxing.boxInt(7), Boxing.boxInt(0)}, 2));
        Intrinsics.checkNotNullExpressionValue(str9, "format(...)");
        String str10 = String.format(string, Arrays.copyOf(new Object[]{Boxing.boxInt(7), Boxing.boxInt(59)}, 2));
        Intrinsics.checkNotNullExpressionValue(str10, "format(...)");
        QuestionOption questionOption6 = new QuestionOption(6, str9 + "-" + str10, Boxing.boxBoolean(false), null, 8, null);
        String str11 = String.format(string, Arrays.copyOf(new Object[]{Boxing.boxInt(8), Boxing.boxInt(0)}, 2));
        Intrinsics.checkNotNullExpressionValue(str11, "format(...)");
        String str12 = String.format(string, Arrays.copyOf(new Object[]{Boxing.boxInt(8), Boxing.boxInt(59)}, 2));
        Intrinsics.checkNotNullExpressionValue(str12, "format(...)");
        return new Pair(boolBoxBoolean, CollectionsKt__CollectionsKt.listOf((Object[]) new Question[]{question, question2, question3, new Question(4, "running_pace", i, i2, CollectionsKt__CollectionsKt.listOf((Object[]) new QuestionOption[]{questionOption, questionOption2, questionOption3, questionOption4, questionOption5, questionOption6, new QuestionOption(7, str11 + "-" + str12, Boxing.boxBoolean(false), null, 8, null), new QuestionOption(8, ResourceExtKt.getString(k1j.Y), Boxing.boxBoolean(false), null, 8, null)}))}));
    }
}
