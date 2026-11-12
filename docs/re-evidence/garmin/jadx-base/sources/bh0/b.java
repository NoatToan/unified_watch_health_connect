package bh0;

import f12.l;
import g22.k;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbh0/b;", "Lbh0/a;", "Lf12/l;", "userSettings", "<init>", "(Lf12/l;)V", "a", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements bh0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f17913a;

    static {
        new a(null);
    }

    public b(l lVar) {
        lVar.getClass();
        this.f17913a = lVar;
    }

    @Override // bh0.a
    public final void a(Double d14) {
        this.f17913a.R2(d14 != null ? (float) d14.doubleValue() : 0.0f, "key_fitness_age_temporary_message_start_date_value");
    }

    @Override // bh0.a
    public final void b(Double d14) {
        this.f17913a.R2(d14 != null ? (float) d14.doubleValue() : 0.0f, "key_fitness_age_temporary_message_start_date_previous_value");
    }

    @Override // bh0.a
    public final void c(LocalDate localDate) {
        String string;
        if (localDate == null || (string = localDate.toString("yyyy-MM-dd")) == null) {
            string = "";
        }
        this.f17913a.S("key_fitness_age_temporary_message_start_date", string);
    }

    @Override // bh0.a
    public final Double d() {
        float fN0 = this.f17913a.n0("key_fitness_age_temporary_message_start_date_previous_value");
        if (fN0 > 0.0f) {
            return Double.valueOf(fN0);
        }
        return null;
    }

    @Override // bh0.a
    public final Double e() {
        float fN0 = this.f17913a.n0("key_fitness_age_temporary_message_start_date_value");
        if (fN0 > 0.0f) {
            return Double.valueOf(fN0);
        }
        return null;
    }

    @Override // bh0.a
    public final LocalDate f() {
        String strA4 = this.f17913a.A4("key_fitness_age_temporary_message_start_date", null);
        if (strA4 == null || strA4.length() == 0) {
            return null;
        }
        return k.w(strA4, "yyyy-MM-dd");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lbh0/b$a;", "", "<init>", "()V", "", "USER_FITNESS_AGE_TEMPORARY_MESSAGE_START_DATE", "Ljava/lang/String;", "USER_FITNESS_AGE_TEMPORARY_MESSAGE_START_DATE_VALUE", "USER_FITNESS_AGE_TEMPORARY_MESSAGE_START_DATE_PREVIOUS_VALUE", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
