package nu;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import android.util.LongSparseArray;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.u;
import f12.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lnu/b;", "Lnu/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b implements h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f127872g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f127873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextToSpeech f127874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f127875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LongSparseArray<zb0.a> f127876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Locale f127877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f127878f;

    static {
        new a(null);
    }

    public b(Context context) {
        context.getClass();
        this.f127873a = context;
        LongSparseArray<zb0.a> longSparseArray = new LongSparseArray<>();
        this.f127876d = longSparseArray;
        l.f68084a.getClass();
        List<String> listM2 = l.a.a().M2();
        List<String> listW0 = l.a.a().w0();
        if (listM2 != null && listM2.size() != 0 && listW0 != null && listW0.size() != 0 && listM2.size() == listW0.size()) {
            int size = listM2.size();
            for (int i14 = 0; i14 < size; i14++) {
                long j8 = Long.parseLong(listM2.get(i14));
                zb0.a.C3799a c3799a = zb0.a.f203414e;
                String str = listW0.get(i14);
                c3799a.getClass();
                longSparseArray.put(j8, zb0.a.C3799a.a(str));
            }
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "BaseTextToSpeech", "Initial device dialects are " + longSparseArray);
    }

    public abstract void a(c cVar);

    @Override // nu.h
    public final void b(long j8, zb0.a aVar) {
        if (aVar != null) {
            String str = aVar.f203419b;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String strD = j.d(j8, "Set device dialect to ", str, " for ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "BaseTextToSpeech", strD);
            Locale localeL = l(aVar);
            i2.a.b(a2Var, "BaseTextToSpeech", "setDeviceDialect - found locale " + localeL);
            if (localeL == null) {
                localeL = new Locale(aVar.f203420c, aVar.f203421d);
            }
            this.f127877e = localeL;
            this.f127878f = j8;
            this.f127876d.put(j8, aVar);
            m();
        }
    }

    @Override // nu.h
    public final int d(Locale locale) {
        TextToSpeech textToSpeech = this.f127874b;
        textToSpeech.getClass();
        return textToSpeech.setLanguage(locale);
    }

    @Override // nu.h
    public final void e(long j8) {
        String strE = org.apache.commons.lang3.e.e(j8, "Remove device dialect for ");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "BaseTextToSpeech", strE);
        if (g(j8)) {
            this.f127876d.remove(j8);
        }
        if (this.f127878f == j8) {
            this.f127878f = 0L;
            this.f127877e = null;
        }
        m();
    }

    @Override // nu.h
    public final Locale f(long j8) {
        Locale locale = this.f127877e;
        if (locale == null || this.f127878f != j8) {
            return null;
        }
        return locale;
    }

    @Override // nu.h
    public final boolean g(long j8) {
        return this.f127876d.get(j8) != null;
    }

    @Override // nu.h
    public final LinkedHashSet h() {
        int iIsLanguageAvailable;
        Locale[] availableLocales = Locale.getAvailableLocales();
        availableLocales.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Locale locale : availableLocales) {
            Integer[] numArr = {1, 0, 2};
            locale.getClass();
            TextToSpeech textToSpeech = this.f127874b;
            int i14 = e.f127879a;
            if (locale.getVariant() == null || !u.q(locale.getVariant(), "POSIX", true)) {
                textToSpeech.getClass();
                iIsLanguageAvailable = textToSpeech.isLanguageAvailable(locale);
            } else {
                iIsLanguageAvailable = -1;
            }
            if (p13.u.z(numArr, Integer.valueOf(iIsLanguageAvailable))) {
                linkedHashSet.add(locale);
            }
        }
        return linkedHashSet;
    }

    @Override // nu.h
    /* JADX INFO: renamed from: isInitialized, reason: from getter */
    public final boolean getF127875c() {
        return this.f127875c;
    }

    @Override // nu.h
    public final int k(long j8) {
        if (this.f127877e != null && this.f127878f == j8) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.k(a2Var, "BaseTextToSpeech", "Current setup matches, call setLanguage with currentDialectLocale");
            TextToSpeech textToSpeech = this.f127874b;
            textToSpeech.getClass();
            return textToSpeech.setLanguage(this.f127877e);
        }
        if (!g(j8)) {
            return -1;
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.k(a2Var2, "BaseTextToSpeech", "Current setup mismatches but we have device dialect, try to update current setup");
        zb0.a aVar3 = this.f127876d.get(j8);
        aVar3.getClass();
        zb0.a aVar4 = aVar3;
        Locale localeL = l(aVar4);
        i2.a.b(a2Var2, "BaseTextToSpeech", "Found locale " + localeL + " for language code " + aVar4.f203419b);
        if (localeL != null) {
            i2.a.k(a2Var2, "BaseTextToSpeech", "Update current setup");
            this.f127877e = localeL;
            this.f127878f = j8;
        }
        Locale locale = this.f127877e;
        if (locale == null) {
            return -1;
        }
        i2.a.k(a2Var2, "BaseTextToSpeech", "Call setLanguage to " + locale);
        TextToSpeech textToSpeech2 = this.f127874b;
        textToSpeech2.getClass();
        return textToSpeech2.setLanguage(this.f127877e);
    }

    public final Locale l(zb0.a aVar) {
        Object next;
        aVar.getClass();
        Locale locale = new Locale(aVar.f203420c, aVar.f203421d);
        LinkedHashSet linkedHashSetH = h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetH) {
            if (s.g(((Locale) obj).getLanguage(), locale.getLanguage())) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        Object obj2 = null;
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (Locale) h0.I0(arrayList);
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.g(((Locale) next).getCountry(), locale.getCountry()));
        Locale locale2 = (Locale) next;
        if (locale2 != null) {
            return locale2;
        }
        for (Object obj3 : arrayList) {
            String country = ((Locale) obj3).getCountry();
            if (country == null || country.length() == 0) {
                obj2 = obj3;
                break;
            }
        }
        Locale locale3 = (Locale) obj2;
        return locale3 == null ? (Locale) h0.b0(arrayList) : locale3;
    }

    public final void m() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LongSparseArray<zb0.a> longSparseArray = this.f127876d;
        if (longSparseArray.size() != 0) {
            int size = longSparseArray.size();
            for (int i14 = 0; i14 < size; i14++) {
                long jKeyAt = longSparseArray.keyAt(i14);
                zb0.a aVar = longSparseArray.get(jKeyAt);
                arrayList.add(String.valueOf(jKeyAt));
                aVar.getClass();
                arrayList2.add(aVar.f203419b);
            }
        }
        l.f68084a.getClass();
        l.a.a().y3(arrayList, arrayList2);
    }

    @Override // nu.h
    public final void shutdown() {
        TextToSpeech textToSpeech = this.f127874b;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnu/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
