package com.xiaomi.smarthome.json;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0010\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001*\u00020\u0003\u001a\u0018\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0001*\u00020\u0003¨\u0006\t"}, d2 = {"asSequence", "Lkotlin/sequences/Sequence;", "Lorg/json/JSONObject;", "Lorg/json/JSONArray;", "asSequenceInt", "", "asSequenceString", "", "kotlin.jvm.PlatformType", "base-utils_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ResponseParserKt {

    /* JADX INFO: renamed from: com.xiaomi.smarthome.json.ResponseParserKt$asSequence$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lorg/json/JSONObject;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.smarthome.json.ResponseParserKt$asSequence$1", f = "ResponseParser.kt", i = {0}, l = {9}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super JSONObject>, Continuation<? super Unit>, Object> {
        final /* synthetic */ JSONArray $this_asSequence;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JSONArray jSONArray, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_asSequence = jSONArray;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asSequence, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws JSONException {
            int length;
            int i;
            SequenceScope sequenceScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope2 = (SequenceScope) this.L$0;
                length = this.$this_asSequence.length();
                i = 0;
                sequenceScope = sequenceScope2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                length = this.I$1;
                i = this.I$0;
                sequenceScope = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (i < length) {
                int i3 = i + 1;
                JSONObject jSONObject = this.$this_asSequence.getJSONObject(i);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(i)");
                this.L$0 = sequenceScope;
                this.I$0 = i3;
                this.I$1 = length;
                this.label = 1;
                if (sequenceScope.yield(jSONObject, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = i3;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super JSONObject> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.smarthome.json.ResponseParserKt$asSequenceInt$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.smarthome.json.ResponseParserKt$asSequenceInt$1", f = "ResponseParser.kt", i = {0}, l = {15}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
    public static final class C34331 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {
        final /* synthetic */ JSONArray $this_asSequenceInt;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34331(JSONArray jSONArray, Continuation<? super C34331> continuation) {
            super(2, continuation);
            this.$this_asSequenceInt = jSONArray;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C34331 c34331 = new C34331(this.$this_asSequenceInt, continuation);
            c34331.L$0 = obj;
            return c34331;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int length;
            int i;
            SequenceScope sequenceScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope2 = (SequenceScope) this.L$0;
                length = this.$this_asSequenceInt.length();
                i = 0;
                sequenceScope = sequenceScope2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                length = this.I$1;
                i = this.I$0;
                sequenceScope = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (i < length) {
                int i3 = i + 1;
                Integer numBoxInt = Boxing.boxInt(this.$this_asSequenceInt.optInt(i));
                this.L$0 = sequenceScope;
                this.I$0 = i3;
                this.I$1 = length;
                this.label = 1;
                if (sequenceScope.yield(numBoxInt, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = i3;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super Integer> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C34331) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.smarthome.json.ResponseParserKt$asSequenceString$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.smarthome.json.ResponseParserKt$asSequenceString$1", f = "ResponseParser.kt", i = {0}, l = {21}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
    public static final class C34341 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object> {
        final /* synthetic */ JSONArray $this_asSequenceString;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34341(JSONArray jSONArray, Continuation<? super C34341> continuation) {
            super(2, continuation);
            this.$this_asSequenceString = jSONArray;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C34341 c34341 = new C34341(this.$this_asSequenceString, continuation);
            c34341.L$0 = obj;
            return c34341;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int length;
            int i;
            SequenceScope sequenceScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope2 = (SequenceScope) this.L$0;
                length = this.$this_asSequenceString.length();
                i = 0;
                sequenceScope = sequenceScope2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                length = this.I$1;
                i = this.I$0;
                sequenceScope = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (i < length) {
                int i3 = i + 1;
                String strOptString = this.$this_asSequenceString.optString(i);
                this.L$0 = sequenceScope;
                this.I$0 = i3;
                this.I$1 = length;
                this.label = 1;
                if (sequenceScope.yield(strOptString, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = i3;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super String> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C34341) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @NotNull
    public static final Sequence<JSONObject> asSequence(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        return SequencesKt__SequenceBuilderKt.sequence(new AnonymousClass1(jSONArray, null));
    }

    @NotNull
    public static final Sequence<Integer> asSequenceInt(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        return SequencesKt__SequenceBuilderKt.sequence(new C34331(jSONArray, null));
    }

    @NotNull
    public static final Sequence<String> asSequenceString(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        return SequencesKt__SequenceBuilderKt.sequence(new C34341(jSONArray, null));
    }
}
