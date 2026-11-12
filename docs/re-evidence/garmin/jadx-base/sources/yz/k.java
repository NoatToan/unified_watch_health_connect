package yz;

import com.github.mikephil.charting.formatter.ValueFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lyz/k;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "", "is24HourFormat", "<init>", "(Z)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends ValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f200227a;

    static {
        new a(null);
    }

    public k(boolean z14) {
        this.f200227a = z14;
    }

    public final String a(float f14) throws ParseException {
        float f15 = 60;
        float f16 = f14 / f15;
        float f17 = f14 % f15;
        Object obj = new SimpleDateFormat("HH:mm", Locale.getDefault()).parse(((int) f16) + ":" + ((int) f17));
        if (obj == null) {
            obj = "";
        }
        String str = new SimpleDateFormat(this.f200227a ? "HH:mm" : "h:mm a", Locale.getDefault()).format(obj);
        str.getClass();
        return str;
    }

    public final String b(float f14) throws ParseException {
        float f15 = 60;
        Object obj = new SimpleDateFormat("HH", Locale.getDefault()).parse(String.valueOf((int) ((f14 / f15) / f15)));
        if (obj == null) {
            obj = "";
        }
        String str = new SimpleDateFormat(this.f200227a ? "HH" : "h a", Locale.getDefault()).format(obj);
        str.getClass();
        return str;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) throws ParseException {
        Object obj = new SimpleDateFormat("HH", Locale.getDefault()).parse(String.valueOf(f14 / 60));
        if (obj == null) {
            obj = "";
        }
        String str = new SimpleDateFormat(this.f200227a ? "HH" : "h a", Locale.getDefault()).format(obj);
        str.getClass();
        return str;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyz/k$a;", "", "<init>", "()V", "", "ONE_HOUR_IN_MINUTES", "I", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
