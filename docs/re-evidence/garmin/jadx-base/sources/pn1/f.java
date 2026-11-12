package pn1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpn1/f;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f138686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b10.c f138687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u00.a f138688c;

    public f(l22.b bVar) {
        bVar.getClass();
        this.f138686a = bVar;
        this.f138687b = new b10.c(bVar);
        this.f138688c = new u00.a(bVar);
    }

    public final String a(String str, String str2) {
        Boolean boolValueOf = Boolean.valueOf(str.length() > 0);
        Boolean boolValueOf2 = Boolean.valueOf(str2.length() > 0);
        Boolean bool = Boolean.TRUE;
        if (s.g(boolValueOf, bool) && s.g(boolValueOf2, bool)) {
            return this.f138686a.a(R.string.string_space_bullet_string_pattern, str, str2);
        }
        if (s.g(boolValueOf, bool)) {
            return str;
        }
        return s.g(boolValueOf2, bool) ? str2 : "";
    }

    public final String b(Context context, Integer num, DateTime dateTime, boolean z14) {
        context.getClass();
        if (num == null) {
            return null;
        }
        this.f138687b.getClass();
        String strA = b10.c.a(dateTime, z14);
        if (strA.length() > 0) {
            strA = "@".concat(strA);
        }
        return this.f138686a.a(R.string.string_space_string_pattern, strA, new oi0.h(context).c(num.intValue(), false));
    }
}
