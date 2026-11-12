package b80;

import com.garmin.proto.generated.GDISubscriptionExtension;
import com.google.protobuf.ExtensionRegistryLite;
import dt2.g;
import g8.i;
import java.util.Set;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.a1;
import rs2.c;
import u53.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lb80/a;", "Ldt2/a;", "<init>", "()V", "a", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements dt2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f16377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f16378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f16379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<Integer> f16380e;

    static {
        new C0232a(null);
    }

    public a() {
        x53.c cVar = s0.f129406a;
        this.f16377b = c0.a(x53.b.f189152a.plus(i.c()));
        this.f16380e = a1.b(115);
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f16380e;
    }

    @Override // dt2.a
    public final void start(c cVar, g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f16379d = gVar;
        this.f16378c = cVar;
        extensionRegistryLite.add(GDISubscriptionExtension.subscriptionService);
    }

    /* JADX INFO: renamed from: b80.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lb80/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "GARMIN_SUBSCRIPTION_SUPPORT_FLAG", "I", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0232a {
        public /* synthetic */ C0232a(j jVar) {
            this();
        }

        private C0232a() {
        }
    }
}
