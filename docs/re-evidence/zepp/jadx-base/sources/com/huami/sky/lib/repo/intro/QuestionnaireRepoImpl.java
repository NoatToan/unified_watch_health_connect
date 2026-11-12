package com.huami.sky.lib.repo.intro;

import com.huami.sky.lib.api.preference.MusicPreferenceApi;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.lib.entity.MusicPreference;
import com.huami.sky.lib.entity.MusicPreferenceItem;
import com.huami.sky.lib.properties.SkyQuestionProperties;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.service.entity.remote.PushResult;
import com.huami.userproperty.service.entity.remote.ResultFuture;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\n2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/huami/sky/lib/repo/intro/QuestionnaireRepoImpl;", "Lcom/huami/sky/lib/repo/intro/IQuestionnaireRepo;", "Lcom/huami/sky/lib/entity/MusicPreference;", "getMusicPreferenceInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "", "Lcom/huami/sky/lib/entity/MusicPreferenceItem;", "answers", "", "saveAndPostQuestionsToServer", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sky/lib/api/preference/MusicPreferenceApi;", "a", "Lcom/huami/sky/lib/api/preference/MusicPreferenceApi;", "getApi", "()Lcom/huami/sky/lib/api/preference/MusicPreferenceApi;", "api", "<init>", "(Lcom/huami/sky/lib/api/preference/MusicPreferenceApi;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class QuestionnaireRepoImpl implements IQuestionnaireRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MusicPreferenceApi api;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.lib.repo.intro.QuestionnaireRepoImpl", f = "QuestionnaireRepoImpl.kt", i = {}, l = {30}, m = "saveAndPostQuestionsToServer", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return QuestionnaireRepoImpl.this.saveAndPostQuestionsToServer(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ PushResult a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PushResult pushResult) {
            super(0);
            this.a = pushResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "skyMusicPreference push result: " + this.a;
        }
    }

    public QuestionnaireRepoImpl(@NotNull MusicPreferenceApi musicPreferenceApi) {
        this.api = musicPreferenceApi;
    }

    @NotNull
    public final MusicPreferenceApi getApi() {
        return this.api;
    }

    @Override // com.huami.sky.lib.repo.intro.IQuestionnaireRepo
    @Nullable
    public Object getMusicPreferenceInfo(@NotNull Continuation<? super MusicPreference> continuation) {
        return getApi().getMusicPreferenceInfo(WebConstant.QueryParam.TYPE_MUSIC).getMusicPreferences();
    }

    @Override // com.huami.sky.lib.repo.intro.IQuestionnaireRepo
    public boolean isSelectedChanged(@NotNull Map<String, ? extends List<MusicPreferenceItem>> map) {
        return IQuestionnaireRepo.DefaultImpls.isSelectedChanged(this, map);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.sky.lib.repo.intro.IQuestionnaireRepo
    @Nullable
    public Object saveAndPostQuestionsToServer(@NotNull Map<String, ? extends List<MusicPreferenceItem>> map, @NotNull Continuation<? super Boolean> continuation) throws JSONException {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            String strAnswerMapToJsonString = IQuestionnaireRepoKt.answerMapToJsonString(map);
            SkyQuestionProperties skyQuestionProperties = SkyQuestionProperties.INSTANCE;
            skyQuestionProperties.getSkyMusicPreference().set(strAnswerMapToJsonString);
            ResultFuture<PushResult> resultFuturePush = skyQuestionProperties.getSkyMusicPreference().push();
            aVar.c = 1;
            obj = resultFuturePush.get(aVar);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        PushResult pushResult = (PushResult) obj;
        HMLog.info("QuestionnaireRepoImpl", new b(pushResult));
        return Boxing.boxBoolean(pushResult instanceof PushResult.Success);
    }
}
