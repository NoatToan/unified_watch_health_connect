package yy1;

import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f200152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f200153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f200154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f200155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1 f200156f;

    public /* synthetic */ j(AddTIEventViewModel addTIEventViewModel, e23.l lVar, p1 p1Var, p1 p1Var2, p1 p1Var3, int i14) {
        this.f200151a = i14;
        this.f200152b = addTIEventViewModel;
        this.f200153c = lVar;
        this.f200154d = p1Var;
        this.f200155e = p1Var2;
        this.f200156f = p1Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f200151a) {
            case 0:
                my1.g gVar = (my1.g) this.f200154d.getF182175a();
                AddTIEventViewModel addTIEventViewModel = this.f200152b;
                addTIEventViewModel.M6(gVar);
                addTIEventViewModel.L6((DateTime) this.f200155e.getF182175a());
                this.f200153c.invoke(Boolean.valueOf(((Boolean) this.f200156f.getF182175a()).booleanValue() && addTIEventViewModel.f46443w2));
                break;
            default:
                my1.g gVar2 = (my1.g) this.f200154d.getF182175a();
                AddTIEventViewModel addTIEventViewModel2 = this.f200152b;
                addTIEventViewModel2.M6(gVar2);
                addTIEventViewModel2.L6((DateTime) this.f200155e.getF182175a());
                this.f200153c.invoke(Boolean.valueOf(((Boolean) this.f200156f.getF182175a()).booleanValue() && addTIEventViewModel2.f46443w2));
                break;
        }
        return Unit.INSTANCE;
    }
}
