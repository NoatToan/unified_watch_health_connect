package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class qji {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<String, ArrayList<cha>> f46311a = new HashMap<>();

    static {
        qja.e(BaseApplication.getContext());
    }

    private qji() {
    }

    public static View.OnClickListener b(View.OnClickListener onClickListener, BaseActivity baseActivity, boolean z, String str) {
        cha chaVar = new cha(onClickListener, z, str);
        a(chaVar, baseActivity.toString());
        return chaVar;
    }

    public static View.OnClickListener d(View.OnClickListener onClickListener, Context context, boolean z, String str) {
        cha chaVar = new cha(onClickListener, z, str);
        a(chaVar, context.toString());
        return chaVar;
    }

    public static void a(cha chaVar, String str) {
        synchronized (qji.class) {
            if (chaVar != null) {
                if (!TextUtils.isEmpty(str)) {
                    HashMap<String, ArrayList<cha>> map = f46311a;
                    ArrayList<cha> arrayList = map.get(str);
                    if (njy.e(arrayList)) {
                        map.put(str, new ArrayList<>(Arrays.asList(chaVar)));
                    } else {
                        arrayList.add(chaVar);
                    }
                }
            }
        }
    }

    public static void d(String str) {
        ArrayList<cha> arrayList = f46311a.get(str);
        if (njy.e(arrayList)) {
            return;
        }
        for (cha chaVar : arrayList) {
            if (chaVar != null) {
                chaVar.e();
            }
        }
        f46311a.remove(str);
    }

    public static void e(final boolean z) {
        LogUtil.a("PLGLOGIN_BrowseLogin", "enter callClickEvent");
        if (Looper.getMainLooper() != Looper.myLooper()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: qji.1
                @Override // java.lang.Runnable
                public void run() {
                    qji.e(z);
                }
            });
            return;
        }
        HashMap<String, ArrayList<cha>> map = f46311a;
        if (map.isEmpty()) {
            LogUtil.j("PLGLOGIN_BrowseLogin", "LISTENERS_MAPS is empty.");
            return;
        }
        Iterator<Map.Entry<String, ArrayList<cha>>> it = map.entrySet().iterator();
        cha chaVar = null;
        while (it.hasNext()) {
            ArrayList<cha> value = it.next().getValue();
            if (!njy.e(value)) {
                for (cha chaVar2 : value) {
                    if (chaVar2.b() != null && !chaVar2.equals(chaVar)) {
                        if (chaVar != null) {
                            if (chaVar2.b(chaVar)) {
                                chaVar.e();
                            } else {
                                chaVar2.e();
                            }
                        }
                        chaVar = chaVar2;
                    }
                }
            }
        }
        if (a(chaVar, z)) {
            LogUtil.a("PLGLOGIN_BrowseLogin", "callClickEvent() do next.");
            chaVar.onNext();
        } else if (chaVar != null) {
            LogUtil.a("PLGLOGIN_BrowseLogin", "callClickEvent() siteid change.");
            chaVar.e();
        } else {
            LogUtil.a("PLGLOGIN_BrowseLogin", "login not by click.");
        }
    }

    private static boolean a(cha chaVar, boolean z) {
        return (z || chaVar == null || LoginInit.getInstance(BaseApplication.getContext()).isKidAccount() || LoginInit.getBrowseCallback() != null) ? false : true;
    }
}
