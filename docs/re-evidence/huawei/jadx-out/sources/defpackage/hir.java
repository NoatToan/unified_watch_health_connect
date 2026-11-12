package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.activity.ActionTrainModeActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class hir {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicAction f36778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f36780c;
    private final Context d;
    private String e;
    private View g;
    private boolean h = false;
    private HealthTextView j;

    public hir(Context context, String str, Map<String, Object> map) {
        this.d = context;
        this.f36779b = str;
        this.f36780c = map;
        ReleaseLogUtil.d("Suggestion_ActionModeBottomViewHelper", "ActionModeViewHelper mActionId:", str);
    }

    public boolean d() {
        return this.h;
    }

    public void a(View view) {
        this.g = view;
        this.j = (HealthTextView) view.findViewById(R.id.train_count);
        ((HealthButton) this.g.findViewById(R.id.start_ai_train)).setOnClickListener(qji.d(new View.OnClickListener() { // from class: hin
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f36775a.b(view2);
            }
        }, this.d, true, ""));
    }

    /* synthetic */ void b(View view) {
        this.h = true;
        Bundle bundle = new Bundle();
        bundle.putString("actionInfo", qqt.b(this.f36778a));
        bundle.putString("describe", this.e);
        bundle.putSerializable("biIntent", (Serializable) this.f36780c);
        iei.a(1, this.f36778a, this.f36780c);
        Context context = this.d;
        if (context instanceof Activity) {
            Intent intent = new Intent(this.d, (Class<?>) ActionTrainModeActivity.class);
            intent.putExtra("intentData", bundle);
            ((Activity) context).startActivityForResult(intent, 10001);
        }
    }

    public void a(AtomicAction atomicAction) {
        if (atomicAction == null) {
            LogUtil.j("Suggestion_ActionModeBottomViewHelper", "showAiActionView atomicAction == null");
            return;
        }
        if (e(atomicAction.getExtendPropertyInt("aiFlag"), atomicAction.getExtendPropertyInt("aiMeasurement"))) {
            this.f36778a = atomicAction;
            this.g.setVisibility(0);
            this.j.setText(gzx.d(R.plurals.sug_train_times, atomicAction.getExtendPropertyInt("completeTimes"), Integer.valueOf(atomicAction.getExtendPropertyInt("completeTimes"))));
            iei.a(0, atomicAction, this.f36780c);
            ThreadPoolManager.c().execute(new Runnable() { // from class: hiq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36777a.a();
                }
            });
            return;
        }
        this.g.setVisibility(8);
    }

    public static boolean e(int i, int i2) {
        int modelType = pqh.b().getModelType();
        ReleaseLogUtil.e("Suggestion_ActionModeBottomViewHelper", "isShowAiTrain aiFlag ", Integer.valueOf(i), "aiMeasurement:", Integer.valueOf(i2), "modelType:", Integer.valueOf(modelType));
        return (i != 1 || nuc.c(i2) == -1 || modelType == -1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (TextUtils.isEmpty(this.f36779b)) {
            LogUtil.j("Suggestion_ActionModeBottomViewHelper", "requireFitnessActionTemplate mActionId isEmpty");
        } else {
            ReleaseLogUtil.d("Suggestion_ActionModeBottomViewHelper", "requireFitnessActionTemplate mActionId:", this.f36779b);
            ((CourseApi) Services.b("CoursePlanService", CourseApi.class)).getFitnessActionTemplate(this.f36779b, new d(this));
        }
    }

    public static class d extends UiCallback<pch> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<hir> f36781a;

        d(hir hirVar) {
            this.f36781a = new WeakReference<>(hirVar);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.e("Suggestion_ActionModeBottomViewHelper", "requireFitnessActionTemplate onFailure ", Integer.valueOf(i), "errorInfo:", str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(pch pchVar) {
            if (pchVar == null) {
                ReleaseLogUtil.e("Suggestion_ActionModeBottomViewHelper", "requireFitnessActionTemplate date == null");
                return;
            }
            List<pcj> listA = pchVar.a();
            if (njy.e(listA) || listA.get(0) == null) {
                ReleaseLogUtil.e("Suggestion_ActionModeBottomViewHelper", "requireFitnessActionTemplate aiConfigInfo == null");
                return;
            }
            hir hirVar = this.f36781a.get();
            if (hirVar != null) {
                hirVar.e = listA.get(0).a();
            } else {
                LogUtil.j("Suggestion_ActionModeBottomViewHelper", "FitnessActionTemplateCallback viewHelper == null");
            }
        }
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Suggestion_ActionModeBottomViewHelper", "getAlgorithmTowards describe isEmpty true");
            return -1;
        }
        try {
            JSONObject jSONObject = new JSONArray(new JSONObject(str).optString("models")).getJSONObject(0);
            if (jSONObject == null) {
                LogUtil.j("Suggestion_ActionModeBottomViewHelper", "getAlgorithmTowards factorsJson == null");
                return -1;
            }
            int iOptInt = new JSONObject(jSONObject.optString("factors")).optInt("towards");
            ReleaseLogUtil.d("Suggestion_ActionModeBottomViewHelper", "requireFitnessActionTemplate towards：", Integer.valueOf(iOptInt));
            return iOptInt;
        } catch (JSONException e) {
            ReleaseLogUtil.a("Suggestion_ActionModeBottomViewHelper", "requireFitnessActionTemplate:", LogAnonymous.b(e));
            return -1;
        }
    }
}
