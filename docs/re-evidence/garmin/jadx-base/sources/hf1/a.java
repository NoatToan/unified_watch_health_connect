package hf1;

import j70.d;
import java.util.List;
import n70.a0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r53.i;
import r53.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001:\u0001\nB#\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00040\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lhf1/a;", "Ln70/a0;", "Lr53/i;", "Lhf1/c;", "Lj70/d;", "", "", "data", "<init>", "(Lr53/i;)V", "a", "gcm-running-tolerance_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements a0<i<? extends c>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f83626b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<d<List<String>>> f83627a;

    static {
        new C1648a(null);
    }

    public a(i<d<List<String>>> iVar) {
        iVar.getClass();
        this.f83627a = iVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetRunningToleranceDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends c> invoke() {
        return s.A(new b(this.f83627a, this), s0.f129406a);
    }

    /* JADX INFO: renamed from: hf1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lhf1/a$a;", "", "<init>", "()V", "", "USER_PROFILE_PK", "Ljava/lang/String;", "CALENDAR_DATE", "ACUTE_TOLERANCE", "ACUTE_DISTANCE", "ACUTE_IMPACT_LOAD", "gcm-running-tolerance_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1648a {
        public /* synthetic */ C1648a(j jVar) {
            this();
        }

        private C1648a() {
        }
    }
}
