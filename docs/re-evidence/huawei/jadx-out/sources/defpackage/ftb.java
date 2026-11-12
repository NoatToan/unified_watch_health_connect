package defpackage;

import android.os.Looper;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.data.KnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ftb extends SectionBean {
    protected List<KnitDataProvider> f;
    private List<c> j;

    public ftb(int i, int i2, int i3, KnitDataProvider knitDataProvider, int i4, String str) {
        super(i, i2, i3, knitDataProvider, i4, str);
        this.f = new ArrayList();
        this.j = new ArrayList();
    }

    @Override // com.huawei.health.knit.section.model.SectionBean
    public c e(KnitDataProvider knitDataProvider) {
        if (njy.e(this.j)) {
            return null;
        }
        for (c cVar : this.j) {
            if (cVar.b() == knitDataProvider) {
                return cVar;
            }
        }
        return null;
    }

    @Override // com.huawei.health.knit.section.model.SectionBean
    public void d(final KnitDataProvider knitDataProvider, final Object obj) {
        if (knitDataProvider == null) {
            throw new IllegalArgumentException("dataProvider can not be null");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HandlerExecutor.c(new Runnable() { // from class: ftb.5
                @Override // java.lang.Runnable
                public void run() {
                    ftb.this.a(knitDataProvider, obj);
                }
            });
        } else {
            a(knitDataProvider, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(KnitDataProvider knitDataProvider, Object obj) {
        synchronized (this) {
            boolean zIsActive = knitDataProvider.isActive(BaseApplication.getContext());
            List<c> list = this.j;
            if (list == null) {
                return;
            }
            if (list.size() != 0) {
                Iterator<c> it = this.j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (obj == null) {
                            this.e = SectionBean.Operation.UNKNOWN;
                            break;
                        } else {
                            e(knitDataProvider, obj, zIsActive);
                            break;
                        }
                    }
                    c next = it.next();
                    if (next.b() == knitDataProvider) {
                        d(obj, zIsActive, next);
                        break;
                    }
                }
            } else if (obj == null) {
                this.e = SectionBean.Operation.UNKNOWN;
            } else {
                c(knitDataProvider, obj, zIsActive);
            }
            if (this.i != null) {
                this.i.e(this);
            }
        }
    }

    private void d(Object obj, boolean z, c cVar) {
        if (this.j.size() != 1) {
            if (obj != null && z) {
                this.e = SectionBean.Operation.CHANGE;
                cVar.c(obj);
                return;
            } else {
                this.e = SectionBean.Operation.CHANGE;
                cVar.c((Object) null);
                return;
            }
        }
        if ((cVar.e() && !z) || (cVar.c() != null && obj == null)) {
            this.e = SectionBean.Operation.REMOVE;
            cVar.c((Object) null);
        } else {
            this.e = SectionBean.Operation.CHANGE;
            cVar.c(obj);
        }
    }

    private void e(KnitDataProvider knitDataProvider, Object obj, boolean z) {
        if (z) {
            this.e = SectionBean.Operation.CHANGE;
            this.j.add(new c(knitDataProvider, obj, true));
            this.f.add(knitDataProvider);
            return;
        }
        this.e = SectionBean.Operation.UNKNOWN;
    }

    private void c(KnitDataProvider knitDataProvider, Object obj, boolean z) {
        if (z) {
            this.e = SectionBean.Operation.INSERT;
            this.j.add(new c(knitDataProvider, obj, true));
            this.f.add(knitDataProvider);
            return;
        }
        this.e = SectionBean.Operation.UNKNOWN;
    }

    @Override // com.huawei.health.knit.section.model.SectionBean
    public void u() {
        super.u();
        List<c> list = this.j;
        if (list != null) {
            list.clear();
        }
        List<KnitDataProvider> list2 = this.f;
        if (list2 != null) {
            Iterator<KnitDataProvider> it = list2.iterator();
            while (it.hasNext()) {
                it.next().onDestroy();
            }
        }
    }

    @Override // com.huawei.health.knit.section.model.SectionBean
    public boolean p() {
        return super.p() && njy.e(this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(KnitDataProvider knitDataProvider) {
        List<c> list;
        if (knitDataProvider == null || (list = this.j) == null) {
            return;
        }
        for (c cVar : list) {
            if (cVar.b() == knitDataProvider) {
                this.j.remove(cVar);
                return;
            }
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f34532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f34533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private KnitDataProvider f34534c;
        private HashMap<String, Object> d = new HashMap<>();

        public c(KnitDataProvider knitDataProvider, Object obj, boolean z) {
            this.f34534c = knitDataProvider;
            this.f34532a = obj;
            this.f34533b = z;
        }

        public KnitDataProvider b() {
            return this.f34534c;
        }

        public void c(Object obj) {
            if (obj == null) {
                LogUtil.a("SectionGroupBean", "map set to null");
                c((HashMap<String, Object>) null);
                ftb.this.c(this.f34534c);
            }
            this.f34532a = obj;
        }

        public Object c() {
            return this.f34532a;
        }

        public boolean e() {
            return this.f34533b;
        }

        public void c(HashMap<String, Object> map) {
            this.d = map;
        }

        public HashMap<String, Object> d() {
            return this.d;
        }
    }
}
