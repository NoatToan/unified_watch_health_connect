package com.huami.sky.lib.repo.intro;

import com.google.gson.Gson;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.lib.entity.MusicPreferenceItem;
import com.huami.tools.log.HMLog;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\u001a \u0010\u0005\u001a\u00020\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000\u001a\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0001¨\u0006\t"}, d2 = {"", "", "", "Lcom/huami/sky/lib/entity/MusicPreferenceItem;", "answers", "answerMapToJsonString", "musicStr", "", "parseMusicStrToArr", "sky-lib_release"}, k = 2, mv = {1, 5, 1})
public final class IQuestionnaireRepoKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ JSONObject a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONObject jSONObject) {
            super(0);
            this.a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "answers to json: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int[] iArr) {
            super(0);
            this.a = iArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parse result: " + ArraysKt___ArraysKt.joinToString$default(this.a, (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        }
    }

    @NotNull
    public static final String answerMapToJsonString(@NotNull Map<String, ? extends List<MusicPreferenceItem>> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends List<MusicPreferenceItem>> entry : map.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it2 = entry.getValue().iterator();
            while (it2.hasNext()) {
                jSONArray.put(((MusicPreferenceItem) it2.next()).getId());
            }
            jSONObject.put(entry.getKey(), jSONArray);
        }
        HMLog.info("QuestionnaireRepoImpl", new a(jSONObject));
        return jSONObject.toString();
    }

    @Nullable
    public static final int[] parseMusicStrToArr(@NotNull String str) {
        int[] iArr = (int[]) new Gson().fromJson(new JSONObject(str).getJSONArray(WebConstant.QueryParam.TYPE_MUSIC).toString(), int[].class);
        HMLog.info("EditRepo", new b(iArr));
        return iArr;
    }
}
