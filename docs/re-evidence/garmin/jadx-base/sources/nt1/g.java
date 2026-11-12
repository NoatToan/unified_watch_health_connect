package nt1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lnt1/g;", "Lg/a;", "", "", "<init>", "()V", "a", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends g.a<String, Unit> {
    static {
        new a(null);
    }

    @Override // g.a
    public final Intent a(Context context, String str) {
        String str2 = str;
        context.getClass();
        str2.getClass();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/uri-list");
        intent.addFlags(1);
        String strEncode = Uri.encode(str2, ":/?#[]@!$&'*+,;=");
        strEncode.getClass();
        intent.putExtra("android.intent.extra.TEXT", u.v(u.v(strEncode, "(", "%28", false), ")", "%29", false));
        Intent intentCreateChooser = Intent.createChooser(intent, context.getString(R.string.lbl_share));
        intentCreateChooser.getClass();
        return intentCreateChooser;
    }

    @Override // g.a
    public final /* bridge */ /* synthetic */ Unit c(int i14, Intent intent) {
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnt1/g$a;", "", "<init>", "()V", "", "ALLOWED_URL_CHARS", "Ljava/lang/String;", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
