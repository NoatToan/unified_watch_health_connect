package sy2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.uisynthesizer.mvp.MVPException;
import e23.l;
import e23.p;
import java.io.Serializable;
import java.util.List;
import p005kotlin.Metadata;
import sy2.c;
import sy2.d;
import sy2.e;
import uy2.w0;
import xy2.k;
import xy2.m;
import xy2.n;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0003*\u000e\b\u0002\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u00052\u00020\u0007:\u0002\u000e\u000fB1\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lsy2/g;", "Lsy2/c;", "ModelType", "Lsy2/d;", "PresenterType", "Lsy2/e;", "ViewType", "", "Lk23/d;", "modelClass", "presenterClass", "viewClass", "<init>", "(Lk23/d;Lk23/d;Lk23/d;)V", "b", "a", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g<ModelType extends c<PresenterType>, PresenterType extends d<ModelType, ViewType>, ViewType extends e<PresenterType>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k23.d<ModelType> f161301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k23.d<PresenterType> f161302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k23.d<ViewType> f161303c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u00028\u00030\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsy2/g$a;", "T", "Lxy2/i;", "value", "<init>", "(Ljava/lang/Object;)V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements xy2.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f161304a;

        public a(T t7) {
            this.f161304a = t7;
        }

        @Override // xy2.i
        public final T b() {
            return this.f161304a;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0003\u0018\u0000*\f\b\u0003\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004\u0012(\u0010\u000b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lsy2/g$b;", "Lsy2/c;", "ModelType", "Lxy2/m;", "Ljava/lang/Class;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lkotlin/Function2;", "", "Luy2/w0;", "Lt13/d;", "", "pickReturn", "<init>", "(Ljava/lang/Class;Le23/p;)V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b<ModelType extends c<?>> extends m<ModelType> {
        public static final Parcelable.Creator<b<?>> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<ModelType> f161305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p<List<w0>, t13.d<? super w0>, Object> f161306b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b<?>> {
            @Override // android.os.Parcelable.Creator
            public final b<?> createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b<>((Class) parcel.readSerializable(), (p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final b<?>[] newArray(int i14) {
                return new b[i14];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Class<ModelType> cls, p<? super List<w0>, ? super t13.d<? super w0>, ? extends Object> pVar) {
            cls.getClass();
            pVar.getClass();
            this.f161305a = cls;
            this.f161306b = pVar;
        }

        @Override // xy2.i
        public final Object b() {
            ty2.b.f167282a.getClass();
            return (c) ty2.b.b(this.f161305a, this.f161306b, new k[0]);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeSerializable(this.f161305a);
            parcel.writeSerializable((Serializable) this.f161306b);
        }
    }

    public g(k23.d<ModelType> dVar, k23.d<PresenterType> dVar2, k23.d<ViewType> dVar3) {
        dVar.getClass();
        dVar2.getClass();
        dVar3.getClass();
        this.f161301a = dVar;
        this.f161302b = dVar2;
        this.f161303c = dVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(hn2.c cVar) {
        xy2.i bVar;
        Intent intent = cVar.getIntent();
        intent.getClass();
        if (((j) ((qy2.b) intent.getParcelableExtra("extra.synthesize.ui_review_config"))) != null) {
            bVar = new b(dh.b.u(this.f161301a), new h(cVar));
        } else {
            Intent intent2 = cVar.getIntent();
            intent2.getClass();
            bVar = (m) intent2.getParcelableExtra("extra.synthesize.model_factory");
        }
        if (bVar == null) {
            throw new MVPException("Failed to get model factory");
        }
        Intent intent3 = cVar.getIntent();
        intent3.getClass();
        xy2.i iVar = (n) intent3.getParcelableExtra("extra.synthesize.presenter_factory");
        if (iVar == null) {
            iVar = null;
        } else {
            Intent intent4 = cVar.getIntent();
            intent4.getClass();
            j jVar = (j) ((qy2.b) intent4.getParcelableExtra("extra.synthesize.ui_review_config"));
            if (jVar != null && jVar.f161309a) {
                final int i14 = 0;
                iVar = new i(new l(this) { // from class: sy2.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f161300b;

                    {
                        this.f161300b = this;
                    }

                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i15 = i14;
                        g gVar = this.f161300b;
                        switch (i15) {
                            case 0:
                                d dVar = (d) obj;
                                dVar.getClass();
                                ty2.b bVar2 = ty2.b.f167282a;
                                k23.d<PresenterType> dVar2 = gVar.f161302b;
                                k[] kVarArr = {new wy2.g()};
                                bVar2.getClass();
                                return (d) ty2.b.a(dVar2, dVar, kVarArr);
                            default:
                                e eVar = (e) obj;
                                eVar.getClass();
                                ty2.b bVar3 = ty2.b.f167282a;
                                k23.d<ViewType> dVar3 = gVar.f161303c;
                                k[] kVarArr2 = {new wy2.a(eVar)};
                                bVar3.getClass();
                                return (e) ty2.b.a(dVar3, eVar, kVarArr2);
                        }
                    }
                }, iVar);
            }
        }
        if (iVar == null) {
            throw new MVPException("Failed to get presenter factory");
        }
        xy2.i aVar = new a((e) cVar);
        Intent intent5 = cVar.getIntent();
        intent5.getClass();
        j jVar2 = (j) ((qy2.b) intent5.getParcelableExtra("extra.synthesize.ui_review_config"));
        if (jVar2 != null && jVar2.f161310b) {
            final int i15 = 1;
            aVar = new i(new l(this) { // from class: sy2.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g f161300b;

                {
                    this.f161300b = this;
                }

                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i16 = i15;
                    g gVar = this.f161300b;
                    switch (i16) {
                        case 0:
                            d dVar = (d) obj;
                            dVar.getClass();
                            ty2.b bVar2 = ty2.b.f167282a;
                            k23.d<PresenterType> dVar2 = gVar.f161302b;
                            k[] kVarArr = {new wy2.g()};
                            bVar2.getClass();
                            return (d) ty2.b.a(dVar2, dVar, kVarArr);
                        default:
                            e eVar = (e) obj;
                            eVar.getClass();
                            ty2.b bVar3 = ty2.b.f167282a;
                            k23.d<ViewType> dVar3 = gVar.f161303c;
                            k[] kVarArr2 = {new wy2.a(eVar)};
                            bVar3.getClass();
                            return (e) ty2.b.a(dVar3, eVar, kVarArr2);
                    }
                }
            }, aVar);
        }
        c cVar2 = (c) bVar.b();
        e eVar = (e) aVar.b();
        d dVar = (d) iVar.b();
        cVar2.a(dVar);
        eVar.a(dVar);
        dVar.e(cVar2);
        dVar.M(eVar);
        dVar.a0();
    }
}
