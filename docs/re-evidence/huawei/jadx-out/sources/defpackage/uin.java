package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.views.FitnessDataOriginView;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class uin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f50183a = new Object();
    private static volatile uin e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomAlertDialog f50185c;
    private boolean f;
    private volatile List<uif> j = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f50184b = Arrays.asList(2, 7, 3, 4, 5, Integer.valueOf(DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value()));
    private List<CommonSingleCallback<Boolean>> d = new ArrayList();

    private uin() {
    }

    public static uin e() {
        if (e == null) {
            synchronized (uin.class) {
                if (e == null) {
                    e = new uin();
                }
            }
        }
        return e;
    }

    public void b() {
        boolean zB = qgr.b(BaseApplication.b());
        this.f = zB;
        if (zB) {
            f();
        } else {
            j();
        }
    }

    private void j() {
        uim.c().a(this.f50184b, System.currentTimeMillis(), new b(this));
    }

    private void f() {
        uim.c().c(lsl.r(System.currentTimeMillis()), new CommonUiBaseResponse() { // from class: uip
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public final void onResponse(int i, Object obj) {
                this.f50187c.c(i, obj);
            }
        });
    }

    /* synthetic */ void c(int i, Object obj) {
        if (i != 0) {
            g();
            a(false);
            return;
        }
        if (!njy.b(obj, uif.class)) {
            LogUtil.j("Suggestion_FitnessOriginDataHelper", "msg.obj not instanceof List");
            g();
            a(false);
        } else if (!(obj instanceof List)) {
            g();
            a(false);
        } else {
            this.j = (List) obj;
            LogUtil.a("Suggestion_FitnessOriginDataHelper", "queryFitnessOriginData: size is ", HiJsonUtil.d(this.j));
            a(true);
        }
    }

    public void g() {
        if (this.j == null) {
            this.j = new ArrayList();
        } else {
            this.j.clear();
        }
    }

    public int a() {
        if (njy.e(this.j)) {
            return 0;
        }
        return this.j.size();
    }

    public List<uif> c() {
        return this.j;
    }

    public boolean d() {
        return a() > 1;
    }

    public void a(Context context, int i) {
        CustomAlertDialog customAlertDialog = this.f50185c;
        if (customAlertDialog == null || !customAlertDialog.isShowing()) {
            FitnessDataOriginView fitnessDataOriginView = new FitnessDataOriginView(context);
            fitnessDataOriginView.setIsOnlyStepSource(this.f);
            fitnessDataOriginView.setFromType(i);
            fitnessDataOriginView.setmListdata(this.j);
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(context);
            builder.b(context.getString(R.string.IDS_device_data_source)).a(fitnessDataOriginView).d(R.string.IDS_common_notification_know_tips, new DialogInterface.OnClickListener() { // from class: uio
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    LogUtil.a("Suggestion_FitnessOriginDataHelper", "showFitnessDataOriginDialog() PositiveButton onClick.");
                }
            });
            CustomAlertDialog customAlertDialogB = builder.b();
            this.f50185c = customAlertDialogB;
            customAlertDialogB.show();
            c(context, i);
        }
    }

    public void a(CommonSingleCallback<Boolean> commonSingleCallback) {
        if (commonSingleCallback != null) {
            synchronized (f50183a) {
                this.d.add(commonSingleCallback);
            }
        }
    }

    public void d(CommonSingleCallback<Boolean> commonSingleCallback) {
        synchronized (f50183a) {
            if (this.d.contains(commonSingleCallback)) {
                this.d.remove(commonSingleCallback);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        List<CommonSingleCallback> listSynchronizedList = Collections.synchronizedList(this.d);
        synchronized (f50183a) {
            for (CommonSingleCallback commonSingleCallback : listSynchronizedList) {
                if (commonSingleCallback != null) {
                    commonSingleCallback.callback(Boolean.valueOf(z));
                }
            }
        }
    }

    private void c(Context context, int i) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("from", Integer.valueOf(i));
        lmf.d().c(context, AnalyticsValue.HEALTH_HOME_DATA_ORIGIN_2010068.value(), map, 0);
    }

    static class b implements BaseResponseCallback<List<uif>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<uin> f50186b;

        b(uin uinVar) {
            this.f50186b = new WeakReference<>(uinVar);
        }

        @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<uif> list) {
            uin uinVar = this.f50186b.get();
            if (uinVar == null) {
                ReleaseLogUtil.a("Suggestion_FitnessOriginDataHelper", "helper is null");
                return;
            }
            uinVar.g();
            if (njy.b(list)) {
                uinVar.j = list;
            }
            LogUtil.a("Suggestion_FitnessOriginDataHelper", "queryStepSourceDataByTypes: queryTypes =  ", uinVar.f50184b, " result size is ", njy.e(list) ? "empty" : Integer.valueOf(list.size()));
            uinVar.a(njy.b(list));
        }
    }
}
