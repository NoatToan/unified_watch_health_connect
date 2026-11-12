package yu0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import pu0.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyu0/d;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f199698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l22.a f199699b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f199700a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.f141279f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.f141281h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.f141280g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f199700a = iArr;
        }
    }

    public d(Context context) {
        context.getClass();
        this.f199698a = context;
        this.f199699b = new l22.a(context);
    }

    public final String a(String str, qu0.c cVar, j jVar) {
        Integer num;
        boolean zR = h0.R(x.k(j.f141279f, j.f141280g, j.f141281h), jVar);
        l22.a aVar = this.f199699b;
        if (zR) {
            return aVar.a(R.string.string_space_bullet_string_pattern, aVar.getString(R.string.lbl_opted_out), str);
        }
        String string = null;
        if ((cVar != null ? cVar.f147881b : null) == qu0.b.f147875g) {
            return aVar.a(R.string.string_space_bullet_string_pattern, aVar.getString(R.string.declined), str);
        }
        if (jVar != null && (num = jVar.f141285b) != null) {
            string = aVar.getString(num.intValue());
        }
        return string == null ? aVar.a(R.string.string_space_string_pattern, aVar.getString(R.string.lbl_text_message), str) : aVar.a(R.string.string_space_bullet_string_pattern, string, str);
    }

    public final String b(boolean z14, boolean z15) {
        l22.a aVar = this.f199699b;
        if (z14) {
            return z15 ? aVar.getString(R.string.lbl_recipients_not_in_garmin_messenger) : aVar.a(R.string.msg_to_send_livetrack_notif_in_messenger, aVar.getString(R.string.lbl_garmin_messenger_app_name));
        }
        return aVar.a(R.string.livetrack_notification_resubscribe_with_parameter_gc_plus_inreach, aVar.getString(R.string.learn_more_garmin_connect_plus));
    }

    public final String c(pu0.b bVar, Boolean bool, boolean z14) {
        qu0.c cVar;
        List<qu0.c> list;
        Object next;
        bVar.getClass();
        l22.a aVar = this.f199699b;
        Context context = this.f199698a;
        if (z14) {
            return aVar.a(R.string.string_space_string_pattern, aVar.getString(R.string.lbl_garmin_messenger_app_name), jg.b.v(context, og.a.I(bVar)));
        }
        if (!lv0.e.a(bVar.f141186d)) {
            if (s.g(bool, Boolean.TRUE)) {
                return a(jg.b.v(context, og.a.K(bVar)), og.a.F(bVar), og.a.G(bVar));
            }
            return s.g(bool, Boolean.FALSE) ? a(jg.b.v(context, og.a.K(bVar)), null, null) : "";
        }
        pu0.f fVar = (pu0.f) h0.d0(bVar.f141186d);
        if (fVar == null || (list = fVar.f141227h) == null) {
            cVar = null;
        } else {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((qu0.c) next).f147880a != qu0.d.LIVETRACK);
            cVar = (qu0.c) next;
        }
        return (cVar != null ? cVar.f147881b : null) == qu0.b.f147875g ? aVar.a(R.string.string_space_bullet_string_pattern, aVar.getString(R.string.lbl_unsubscribed), og.a.B(bVar)) : og.a.B(bVar);
    }
}
