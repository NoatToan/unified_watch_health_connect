package fi2;

import android.content.Context;
import android.content.DialogInterface;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfi2/a0;", "Lfi2/e0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a0 extends e0 {

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends p005kotlin.jvm.internal.w implements e23.p<DialogInterface, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f71776a = new a();

        public a() {
            super(2);
        }

        @Override // e23.p
        public final Unit invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            dialogInterface2.getClass();
            dialogInterface2.cancel();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fi2.e0, ei2.h
    public final void n(ii2.b bVar, Map<String, ? extends Object> map, Object obj) {
        String strB4;
        bVar.getClass();
        map.getClass();
        Object obj2 = obj;
        if (!(obj2 instanceof List)) {
            obj2 = null;
        }
        List list = (List) obj2;
        if (list != null) {
            boolean z14 = false;
            int iIntValue = ((Number) list.get(0)).intValue();
            int iIntValue2 = ((Number) list.get(1)).intValue();
            int iIntValue3 = ((Number) list.get(2)).intValue();
            long seconds = TimeUnit.HOURS.toSeconds((iIntValue3 == 0 && iIntValue == 12) ? 0 : iIntValue) + TimeUnit.MINUTES.toSeconds(iIntValue2) + ((iIntValue3 != 1 || iIntValue == 12) ? 0L : 43200L);
            List<Map<String, Object>> listC4 = bVar.C4(map);
            if (listC4 != null) {
                Iterator<T> it = listC4.iterator();
                while (it.hasNext()) {
                    Map map2 = (Map) it.next();
                    if (p005kotlin.jvm.internal.s.g(map2.get(mh2.i.ID.f118617a), mh2.m.WAKE_TIME.f118678a) && (strB4 = bVar.B4(String.valueOf(map2.get(mh2.i.VALUE_ID.f118617a)))) != null) {
                        hi2.a.f83879a.getClass();
                        if (hi2.a.C1658a.a(strB4) == seconds) {
                            z14 = true;
                        }
                    }
                }
            }
            if (!z14) {
                bVar.L4(Long.valueOf(seconds), String.valueOf(map.get(mh2.i.VALUE_ID.f118617a)));
                return;
            }
            kh2.g.a aVar = kh2.g.f104792a;
            Context context = this.f64388a;
            String string = context.getString(R.string.sleep_time_label);
            x0 x0Var = x0.f105818a;
            String string2 = context.getString(R.string.sleep_validation_error_message);
            string2.getClass();
            String str = String.format(string2, Arrays.copyOf(new Object[]{context.getString(R.string.sleep_title), context.getString(R.string.sleep_lbl_awake)}, 2));
            String string3 = context.getString(R.string.lbl_ok);
            string3.getClass();
            kh2.g.a.c(kh2.g.a.a(aVar, context, string, str, new o13.p(string3, a.f71776a), null, 256), context);
        }
    }
}
