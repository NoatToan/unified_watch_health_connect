package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Message;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class nvl implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f43818b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f43819c;
    private static String e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f43820a;
    private Context d;
    private boolean f;
    private boolean g;
    private final boolean h;
    private nvo.a.e j;

    public nvl(Context context, Handler handler, boolean z, boolean z2, boolean z3) {
        this.d = context;
        this.f43820a = handler;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public static void e(boolean z) {
        f43818b = z;
    }

    public static void b(String str) {
        e = str;
    }

    public static void e(String str) {
        f43819c = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nvo.a aVarC;
        if (this.f) {
            aVarC = a();
        } else if (this.g) {
            aVarC = b();
        } else if (this.h) {
            aVarC = h();
        } else {
            aVarC = c();
        }
        if (aVarC == null) {
            d(0, null);
            return;
        }
        nvo.a.e eVarA = a(aVarC);
        this.j = eVarA;
        List<nuk> listA = eVarA != null ? a(eVarA.f43827c) : null;
        if (listA == null) {
            LogUtil.j("AppPullChangeLogThread", "run changelog is null");
            d(0, null);
        } else {
            LogUtil.d("AppPullChangeLogThread", "run changelog is not null");
            d(1, listA);
        }
    }

    private nvo.a a() {
        if (nuw.b().j() != null) {
            String str = nuw.b().j().split("full/")[0] + "full/changelog.xml";
            String strD = d();
            String strI = i();
            LogUtil.d("AppPullChangeLogThread", "getAppChangeLog APP: current system language=", strD, " newLanguage", strI);
            return nvo.d(this.d, str, strD, strI);
        }
        LogUtil.j("AppPullChangeLogThread", "getAppChangeLog DOWNLOADURL is null");
        return null;
    }

    private nvo.a b() {
        if (nuw.c().j() != null) {
            String str = nuw.c().j().split("full/")[0] + "full/changelog.xml";
            String strD = d();
            String strI = i();
            LogUtil.a("AppPullChangeLogThread", "getAw70ChangeLog AW70 Band: current system language=", strD, " newLanguage", strI);
            return nvo.b(this.d, str, strD, strI, e);
        }
        LogUtil.j("AppPullChangeLogThread", "getAw70ChangeLog AW70 DOWNLOADURL is null");
        return null;
    }

    private nvo.a h() {
        if (nuw.o().j() != null) {
            String str = nuw.o().j().split("full/")[0] + "full/changelog.xml";
            String strD = d();
            String strI = i();
            LogUtil.d("AppPullChangeLogThread", "getScaleChangeLog Scale Band: current system language=", strD, " newLanguage", strI);
            return nvo.d(this.d, str, strD, strI);
        }
        LogUtil.j("AppPullChangeLogThread", "getScaleChangeLog Scale DOWNLOADURL is null");
        return null;
    }

    private nvo.a c() {
        String strD = d();
        String strI = i();
        LogUtil.a("AppPullChangeLogThread", "getBandChangeLog Band: current system language=", strD, " newLanguage", strI);
        num numVarA = nuw.a();
        if (numVarA != null && numVarA.j() != null) {
            String[] strArrSplit = numVarA.j().split("full/");
            LogUtil.a("AppPullChangeLogThread", "getBandChangeLog: ", e);
            return nvo.b(this.d, strArrSplit[0] + "full/changelog.xml", strD, strI, e);
        }
        String str = f43819c;
        if (str != null) {
            LogUtil.a("AppPullChangeLogThread", "getBandChangeLog mVersionUrl=", str);
            return nvo.b(this.d, f43819c, strD, strI, e);
        }
        LogUtil.j("AppPullChangeLogThread", "getBandChangeLog Band DOWNLOADURL is null");
        return null;
    }

    private void d(int i, Object obj) {
        Handler handler = this.f43820a;
        if (handler == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i;
        messageObtainMessage.obj = obj;
        if (f43818b) {
            return;
        }
        this.f43820a.sendMessage(messageObtainMessage);
    }

    private String d() {
        Configuration configuration = this.d.getResources().getConfiguration();
        return (LanguageUtil.b(this.d) + '-' + configuration.locale.getCountry()).toLowerCase(Locale.ENGLISH);
    }

    private String i() {
        String strB = pjn.b(null);
        return strB == null ? "" : strB.toLowerCase(Locale.ENGLISH);
    }

    public nvo.a.e a(nvo.a aVar) {
        if (aVar == null) {
            LogUtil.j("AppPullChangeLogThread", "getFeatureWhenPullChangeLogSuccess msgObjOfCallBack==null");
            return null;
        }
        LogUtil.d("AppPullChangeLogThread", "getFeatureWhenPullChangeLogSuccess pull change log success", ", changeLogXml.mCurrentLanguage = ", Integer.valueOf(aVar.f43822b));
        if (aVar.f43822b != -1) {
            return aVar.e.get(aVar.f43822b);
        }
        if (aVar.f43821a != -1) {
            return aVar.e.get(aVar.f43821a);
        }
        return null;
    }

    private List<nuk> a(List<nvo.a.c> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (nvo.a.c cVar : list) {
                nuk nukVar = new nuk();
                StringBuffer stringBuffer = new StringBuffer("");
                if (cVar != null) {
                    nukVar.c(cVar.d);
                    Iterator<String> it = cVar.f43824b.iterator();
                    while (it.hasNext()) {
                        stringBuffer.append(it.next());
                    }
                    nukVar.a(stringBuffer.toString());
                    arrayList.add(nukVar);
                } else {
                    nukVar.c(null);
                }
            }
        }
        return arrayList;
    }

    public void e() {
        Thread thread = new Thread(this);
        thread.setName("Ver-PullLog");
        thread.start();
    }
}
