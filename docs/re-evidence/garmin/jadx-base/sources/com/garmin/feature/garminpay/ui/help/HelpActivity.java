package com.garmin.feature.garminpay.ui.help;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.common.GenericHelpPageActivity;
import e23.l;
import hn2.c;
import mt0.b2;
import ne2.t;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/ui/help/HelpActivity;", "Lhn2/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HelpActivity extends c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Logger f52105j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s03.a f52106g = new s03.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f52107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.garmin.feature.garminpay.ui.help.a f52108i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements l<com.garmin.feature.garminpay.ui.help.a.b, Unit> {
        public b(Object obj) {
            super(1, obj, HelpActivity.class, "onAdapterClick", "onAdapterClick(Lcom/garmin/feature/garminpay/ui/help/HelpAdapter$HelpItemClick;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(com.garmin.feature.garminpay.ui.help.a.b bVar) {
            com.garmin.feature.garminpay.ui.help.a.b bVar2 = bVar;
            bVar2.getClass();
            HelpActivity helpActivity = (HelpActivity) this.receiver;
            Logger logger = HelpActivity.f52105j;
            helpActivity.getClass();
            if (bVar2 instanceof com.garmin.feature.garminpay.ui.help.a.b.d) {
                or2.b.f133424a.getClass();
                helpActivity.startActivity(or2.b.a());
            } else if (bVar2 instanceof com.garmin.feature.garminpay.ui.help.a.b.e) {
                GenericHelpPageActivity.a aVar = GenericHelpPageActivity.f51857k;
                GenericHelpPageActivity.b bVar3 = GenericHelpPageActivity.b.WATCH_NOT_SHOWN;
                aVar.getClass();
                GenericHelpPageActivity.a.a(helpActivity, bVar3);
            } else if (bVar2 instanceof com.garmin.feature.garminpay.ui.help.a.b.c) {
                GenericHelpPageActivity.a aVar2 = GenericHelpPageActivity.f51857k;
                GenericHelpPageActivity.b bVar4 = GenericHelpPageActivity.b.HOW_TO_UPDATE;
                aVar2.getClass();
                GenericHelpPageActivity.a.a(helpActivity, bVar4);
            } else {
                HelpActivity.f52105j.debug("onAdapterClick " + bVar2 + " not handled");
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f52105j = gt2.b.f79005a.h("PAY#HelpActivity");
    }

    public HelpActivity() {
        ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).getClass();
        this.f52107h = "5.30.1";
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.generic_recycler_view, c.a.BACK, getString(R.string.lbl_help));
        this.f52108i = new com.garmin.feature.garminpay.ui.help.a(this, this.f52107h);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        com.garmin.feature.garminpay.ui.help.a aVar = this.f52108i;
        if (aVar == null) {
            s.m("helpAdapter");
            throw null;
        }
        recyclerView.setAdapter(aVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f52106g.e();
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        com.garmin.feature.garminpay.ui.help.a aVar = this.f52108i;
        if (aVar == null) {
            s.m("helpAdapter");
            throw null;
        }
        this.f52106g.a(aVar.f52113d.d(new b2(new b(this), 19), new b2(new t(19), 20)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/ui/help/HelpActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
