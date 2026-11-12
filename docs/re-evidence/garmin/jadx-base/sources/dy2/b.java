package dy2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import cq0.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.SerializationException;
import o13.m;
import o13.p;
import o13.t;
import p005kotlin.Metadata;
import p13.u0;
import p13.x;
import yx2.c;
import yx2.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ldy2/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isSingleUser", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "sharedPrefFunction", "<init>", "(Landroid/content/Context;ZLe23/a;)V", "a", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<String> f61650c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<SharedPreferences> f61651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f61652b;

    static {
        new a(null);
        f61650c = x.k("single_user", "cache_expiration");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Context context, boolean z14, e23.a<? extends SharedPreferences> aVar) {
        context.getClass();
        aVar.getClass();
        this.f61651a = aVar;
        this.f61652b = m.b(new g(this, 27));
        if (!e().contains("single_user")) {
            SharedPreferences sharedPreferencesE = e();
            synchronized (this) {
                SharedPreferences.Editor editorEdit = sharedPreferencesE.edit();
                editorEdit.putBoolean("single_user", z14);
                editorEdit.commit();
            }
            return;
        }
        if (e().getBoolean("single_user", true) != z14) {
            b(e());
            SharedPreferences sharedPreferencesE2 = e();
            synchronized (this) {
                SharedPreferences.Editor editorEdit2 = sharedPreferencesE2.edit();
                editorEdit2.putBoolean("single_user", z14);
                editorEdit2.commit();
            }
        }
    }

    public final synchronized void a(String str, List<c> list) {
        try {
            str.getClass();
            list.getClass();
            if (f()) {
                g(e(), str, null);
            }
            i(e());
            g(e(), str, list);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public final synchronized void b(SharedPreferences sharedPreferences) {
        boolean z14 = sharedPreferences.getBoolean("single_user", true);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.clear().putBoolean("single_user", z14);
        editorEdit.commit();
    }

    @SuppressLint({"ApplySharedPref"})
    public final synchronized void c(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(str, null);
        if (string != null) {
            n63.b.a aVar = n63.b.f123892d;
            aVar.getClass();
            dy2.a.Companion companion = dy2.a.INSTANCE;
            String strB = aVar.b(companion.serializer(), new dy2.a(((dy2.a) aVar.c(companion.serializer(), string)).f61647a, null));
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(str, strB);
            editorEdit.commit();
        }
    }

    public final synchronized Map<String, dy2.a> d() {
        ArrayList arrayList;
        try {
            Set<String> setKeySet = e().getAll().keySet();
            ArrayList<String> arrayList2 = new ArrayList();
            for (Object obj : setKeySet) {
                if (!f61650c.contains((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList();
            for (String str : arrayList2) {
                p pVar = null;
                try {
                    String string = e().getString(str, null);
                    if (string != null) {
                        n63.b.a aVar = n63.b.f123892d;
                        aVar.getClass();
                        pVar = new p(str, (dy2.a) aVar.c(dy2.a.INSTANCE.serializer(), string));
                    }
                } catch (SerializationException unused) {
                    SharedPreferences sharedPreferencesE = e();
                    str.getClass();
                    synchronized (this) {
                        SharedPreferences.Editor editorEdit = sharedPreferencesE.edit();
                        editorEdit.remove(str);
                        editorEdit.commit();
                    }
                }
                if (pVar != null) {
                    arrayList.add(pVar);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return u0.l(arrayList);
    }

    public final SharedPreferences e() {
        return (SharedPreferences) this.f61652b.getValue();
    }

    public final synchronized boolean f() {
        return e().getLong("cache_expiration", 0L) <= System.currentTimeMillis();
    }

    @SuppressLint({"ApplySharedPref"})
    public final synchronized void g(SharedPreferences sharedPreferences, String str, List<c> list) {
        j jVar = null;
        try {
            String string = sharedPreferences.getString(str, null);
            if (string != null) {
                n63.b.a aVar = n63.b.f123892d;
                aVar.getClass();
                jVar = ((dy2.a) aVar.c(dy2.a.INSTANCE.serializer(), string)).f61648b;
            }
            dy2.a aVar2 = new dy2.a(list, jVar);
            n63.b.a aVar3 = n63.b.f123892d;
            aVar3.getClass();
            String strB = aVar3.b(dy2.a.INSTANCE.serializer(), aVar2);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(str, strB);
            editorEdit.commit();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public final synchronized void h(SharedPreferences sharedPreferences, String str, j jVar) {
        List<c> list = null;
        try {
            String string = sharedPreferences.getString(str, null);
            if (string != null) {
                n63.b.a aVar = n63.b.f123892d;
                aVar.getClass();
                list = ((dy2.a) aVar.c(dy2.a.INSTANCE.serializer(), string)).f61647a;
            }
            dy2.a aVar2 = new dy2.a(list, jVar);
            n63.b.a aVar3 = n63.b.f123892d;
            aVar3.getClass();
            String strB = aVar3.b(dy2.a.INSTANCE.serializer(), aVar2);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(str, strB);
            editorEdit.commit();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public final synchronized void i(SharedPreferences sharedPreferences) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        h23.c.f81216a.getClass();
        long millis = timeUnit.toMillis(h23.c.f81217b.f(-10L, 11L));
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong("cache_expiration", System.currentTimeMillis() + 86400000 + millis);
        editorEdit.commit();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ldy2/b$a;", "", "<init>", "()V", "", "CACHE_PREFS", "Ljava/lang/String;", "KEY_SINGLE_USER", "KEY_CACHE_EXPIRATION", "", "notSubscriptionStorage", "Ljava/util/List;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ b(Context context, boolean z14, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, z14, (i14 & 4) != 0 ? new cy1.a(context, 4) : aVar);
    }
}
