package com.garmin.feature.garminpay.ui.dev.devices;

import am.j;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.joran.action.ActionConst;
import com.garmin.android.apps.connectmobile.R;
import fo2.s;
import fo2.u;
import hx0.k;
import i3.e5;
import java.util.ArrayList;
import js2.d;
import js2.e;
import ms2.g;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p13.h0;
import ps2.n;
import ps2.w;
import sd2.f;
import w52.u0;
import zn2.g1;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003\t\n\u000bB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/garmin/feature/garminpay/ui/dev/devices/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/garmin/feature/garminpay/ui/dev/devices/a$c;", "Landroid/content/Context;", "mContext", "Lcom/garmin/feature/garminpay/ui/dev/devices/a$b;", "mItemClickListener", "<init>", "(Landroid/content/Context;Lcom/garmin/feature/garminpay/ui/dev/devices/a$b;)V", "a", "b", "c", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<c> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f51918i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f51919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f51920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f51921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f51922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Drawable f51923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f51924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f51925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f51926h;

    public interface b {
        void a(f fVar);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/dev/devices/a$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Lcom/garmin/feature/garminpay/ui/dev/devices/a;Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends RecyclerView.f0 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final /* synthetic */ int f51927q = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f51928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f51929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f51930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f51931d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f51932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f51933f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TextView f51934g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TextView f51935h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final TextView f51936i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ImageView f51937j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final ImageView f51938k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final ImageView f51939l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final ImageView f51940m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final View f51941n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final View f51942o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ a f51943p;

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.dev.devices.a$c$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1085a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f51944a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f51945b;

            static {
                int[] iArr = new int[js2.c.values().length];
                try {
                    iArr[js2.c.UNKNOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[js2.c.OWNER_DATA_SET.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[js2.c.OWNER_DATA_NOT_SET.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[js2.c.FAILED_TO_GET_OWNER_DATA.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f51944a = iArr;
                int[] iArr2 = new int[e.values().length];
                try {
                    iArr2[e.PASSCODE_SET.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[e.NO_PASSCODE_SET.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                f51945b = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a aVar, View view2) {
            super(view2);
            view2.getClass();
            this.f51943p = aVar;
            View viewFindViewById = view2.findViewById(R.id.name);
            viewFindViewById.getClass();
            this.f51928a = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.image);
            viewFindViewById2.getClass();
            this.f51937j = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.bluetooth_icon);
            viewFindViewById3.getClass();
            this.f51938k = (ImageView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.bluetooth_text);
            viewFindViewById4.getClass();
            this.f51930c = (TextView) viewFindViewById4;
            View viewFindViewById5 = view2.findViewById(R.id.nfc_text);
            viewFindViewById5.getClass();
            this.f51931d = (TextView) viewFindViewById5;
            View viewFindViewById6 = view2.findViewById(R.id.details);
            viewFindViewById6.getClass();
            this.f51929b = (TextView) viewFindViewById6;
            View viewFindViewById7 = view2.findViewById(R.id.overflow);
            viewFindViewById7.getClass();
            this.f51940m = (ImageView) viewFindViewById7;
            View viewFindViewById8 = view2.findViewById(R.id.nfc_icon);
            viewFindViewById8.getClass();
            this.f51939l = (ImageView) viewFindViewById8;
            View viewFindViewById9 = view2.findViewById(R.id.bluetooth_conn_container);
            viewFindViewById9.getClass();
            this.f51941n = viewFindViewById9;
            View viewFindViewById10 = view2.findViewById(R.id.nfc_conn_container);
            viewFindViewById10.getClass();
            this.f51942o = viewFindViewById10;
            View viewFindViewById11 = view2.findViewById(R.id.gc_nfc_capable);
            viewFindViewById11.getClass();
            this.f51932e = (TextView) viewFindViewById11;
            View viewFindViewById12 = view2.findViewById(R.id.device_nfc_chip_type);
            viewFindViewById12.getClass();
            this.f51933f = (TextView) viewFindViewById12;
            View viewFindViewById13 = view2.findViewById(R.id.device_nfc_capabilities);
            viewFindViewById13.getClass();
            this.f51934g = (TextView) viewFindViewById13;
            View viewFindViewById14 = view2.findViewById(R.id.owner);
            viewFindViewById14.getClass();
            this.f51935h = (TextView) viewFindViewById14;
            View viewFindViewById15 = view2.findViewById(R.id.passcode);
            viewFindViewById15.getClass();
            this.f51936i = (TextView) viewFindViewById15;
        }
    }

    static {
        new C1084a(null);
        int i14 = gt2.c.f79010a;
        f51918i = gt2.b.f79005a.h("PAY#DevicesAdapter");
    }

    public a(Context context, b bVar) {
        context.getClass();
        bVar.getClass();
        this.f51919a = context;
        this.f51920b = bVar;
        this.f51922d = a7.b.getDrawable(context, 2131232499);
        this.f51923e = a7.b.getDrawable(context, 2131232500);
        this.f51925g = a7.b.getColor(context, R.color.GPcolorBackgroundTintNegative);
        this.f51924f = a7.b.getColor(context, R.color.GPcolorBackgroundTintPositive);
        this.f51926h = -256;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        ArrayList arrayList = this.f51921c;
        arrayList.getClass();
        return arrayList.size();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x028b  */
    /* JADX WARN: Code duplicated, block: B:103:0x028f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0293  */
    /* JADX WARN: Code duplicated, block: B:107:0x0297  */
    /* JADX WARN: Code duplicated, block: B:109:0x029d  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:111:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:112:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:115:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:131:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:133:0x0306 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:40:0x0172  */
    /* JADX WARN: Code duplicated, block: B:41:0x0174  */
    /* JADX WARN: Code duplicated, block: B:44:0x017a  */
    /* JADX WARN: Code duplicated, block: B:45:0x017d  */
    /* JADX WARN: Code duplicated, block: B:48:0x018c  */
    /* JADX WARN: Code duplicated, block: B:49:0x018e  */
    /* JADX WARN: Code duplicated, block: B:52:0x019b  */
    /* JADX WARN: Code duplicated, block: B:55:0x01af  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x01d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x0208  */
    /* JADX WARN: Code duplicated, block: B:77:0x021e  */
    /* JADX WARN: Code duplicated, block: B:80:0x022c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0259  */
    /* JADX WARN: Code duplicated, block: B:85:0x0267  */
    /* JADX WARN: Code duplicated, block: B:88:0x026e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0272  */
    /* JADX WARN: Code duplicated, block: B:92:0x0274  */
    /* JADX WARN: Code duplicated, block: B:95:0x0281 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0283 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0285  */
    /* JADX WARN: Code duplicated, block: B:99:0x0288  */
    /* JADX WARN: Instruction removed from duplicated block: B:109:0x029d, please report this as an issue */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        TextView textView;
        TextView textView2;
        String str;
        String str2;
        Class cls;
        boolean zA;
        int i15;
        Drawable drawable;
        CharSequence charSequence;
        js2.c cVar;
        boolean z14;
        n nVarI;
        js2.c cVar2;
        int i16;
        String str3;
        String str4;
        int i17;
        Enum r14;
        int i18;
        c cVar3;
        d dVar;
        d dVar2;
        e eVar;
        String strName;
        js2.b bVar;
        d dVar3;
        c cVar4 = (c) f0Var;
        cVar4.getClass();
        ArrayList arrayList = this.f51921c;
        arrayList.getClass();
        f fVar = (f) arrayList.get(i14);
        TextView textView3 = cVar4.f51930c;
        View view2 = cVar4.f51941n;
        ImageView imageView = cVar4.f51939l;
        TextView textView4 = cVar4.f51936i;
        TextView textView5 = cVar4.f51935h;
        TextView textView6 = cVar4.f51932e;
        TextView textView7 = cVar4.f51933f;
        TextView textView8 = cVar4.f51931d;
        ImageView imageView2 = cVar4.f51938k;
        TextView textView9 = cVar4.f51934g;
        View view3 = cVar4.f51942o;
        a aVar = cVar4.f51943p;
        fVar.getClass();
        b bVar2 = this.f51920b;
        bVar2.getClass();
        g gVarA = w.f140538a.a(is2.b.FITPAY);
        if (gVarA instanceof z0) {
            g1 g1Var = ((z0) gVarA).f205979a;
            u uVar = g1Var.f205530e;
            if (uVar == null || (str2 = uVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) == null) {
                str2 = "";
            }
            textView = textView4;
            textView2 = textView5;
            s sVarE = g1Var.E(fVar.getUnitID());
            if (sVarE == null || (str = sVarE.f73101a) == null) {
                str = "";
            }
        } else {
            textView = textView4;
            textView2 = textView5;
            str = null;
            str2 = null;
        }
        Context context = aVar.f51919a;
        int i19 = aVar.f51924f;
        int i24 = aVar.f51925g;
        com.bumptech.glide.b.e(context).l(u0.t(fVar)).E(cVar4.f51937j);
        cVar4.f51928a.setText(fVar.getProductDisplayName());
        StringBuilder sb3 = new StringBuilder("unit id: ");
        sb3.append(fVar.getUnitID());
        sb3.append("<br/>mac addr: ");
        sb3.append(fVar.d0());
        sb3.append("<br/>part nbr: ");
        sb3.append(fVar.getPartNumber());
        sb3.append("<br/>device type key: ");
        sb3.append(fVar.getApplicationKey());
        sb3.append("<br/>fw ver: ");
        sb3.append(fVar.getSoftwareVersion());
        sb3.append("<br/>-------<br/>");
        if (str2 != null) {
            j.y(sb3, "fp user id: ", str2, "<br/>");
        }
        if (str != null) {
            sb3.append("fp device id: ");
            sb3.append(str);
        }
        Spanned spannedFromHtml = Html.fromHtml(sb3.toString(), 63);
        spannedFromHtml.getClass();
        cVar4.f51929b.setText(spannedFromHtml);
        imageView2.setVisibility(8);
        imageView.setVisibility(8);
        textView8.setVisibility(8);
        view3.setVisibility(8);
        textView6.setVisibility(8);
        textView9.setVisibility(8);
        if (TextUtils.isEmpty(fVar.d0())) {
            view2.setBackgroundColor(i24);
            imageView2.setVisibility(8);
            textView3.setText(aVar.f51919a.getString(R.string.txt_garmin_device_not_paired));
            cVar3 = cVar4;
        } else {
            long unitID = fVar.getUnitID();
            Logger logger = f51918i;
            if (unitID != 0) {
                try {
                    cls = hn2.a.class;
                    try {
                        zA = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).a(fVar.getUnitID());
                    } catch (RemoteException e4) {
                        e = e4;
                        logger.error("isHandshakeCompleted", (Throwable) e);
                        zA = false;
                    }
                } catch (RemoteException e14) {
                    e = e14;
                    cls = hn2.a.class;
                }
                if (zA) {
                    i15 = i19;
                } else {
                    i15 = i24;
                }
                view2.setBackgroundColor(i15);
                if (zA) {
                    drawable = aVar.f51922d;
                } else {
                    drawable = aVar.f51923e;
                }
                imageView2.setImageDrawable(drawable);
                imageView2.setVisibility(0);
                if (zA) {
                    charSequence = "connected";
                } else {
                    charSequence = "not connected";
                }
                textView3.setText(charSequence);
                if (fVar.getUnitID() != 0) {
                    cVar = null;
                    try {
                        z14 = ((hn2.a) KoinJavaComponent.get$default(cls, null, null, 6, null)).i(fVar.d0()) != null;
                    } catch (RemoteException e15) {
                        logger.error("nfcIsConnected", (Throwable) e15);
                    }
                    w wVar = w.f140538a;
                    long unitID2 = fVar.getUnitID();
                    wVar.getClass();
                    nVarI = w.i(unitID2);
                    if (!z14 && nVarI != null) {
                        textView8.setText("connected");
                        view3.setBackgroundColor(i19);
                    } else if (z14) {
                        textView8.setText("no wallet");
                        view3.setBackgroundColor(aVar.f51926h);
                    } else {
                        textView8.setText("not connected");
                        view3.setBackgroundColor(i24);
                    }
                    imageView.setVisibility(0);
                    textView8.setVisibility(0);
                    view3.setVisibility(0);
                    textView6.setVisibility(0);
                    if (fVar.i1()) {
                        textView6.setBackgroundColor(i19);
                    } else {
                        textView6.setBackgroundColor(i24);
                    }
                    textView7.setVisibility(0);
                    if (nVarI != null) {
                        textView7.setText(nVarI.f140498a.getNfcInfo().getNfcChipType().name());
                        textView7.setBackgroundColor(i19);
                    } else {
                        textView7.setText("(Not Available)");
                        textView7.setBackgroundColor(i24);
                    }
                    textView9.setVisibility(0);
                    if (nVarI != null) {
                        textView9.setText(h0.k0(h0.N0(nVarI.f140498a.getNfcInfo().b(), new ir2.a()), "\n", null, null, null, 62));
                        textView9.setBackgroundColor(i19);
                    } else {
                        textView9.setText("(Not available)");
                        textView9.setBackgroundColor(i24);
                    }
                    TextView textView10 = textView2;
                    textView10.setVisibility(0);
                    if (nVarI != null || (dVar3 = nVarI.f140513p) == null) {
                        cVar2 = cVar;
                    } else {
                        cVar2 = dVar3.f100662c;
                    }
                    if (cVar2 == null) {
                        i16 = -1;
                    } else {
                        i16 = c.C1085a.f51944a[cVar2.ordinal()];
                    }
                    str3 = "NULL WALLET";
                    if (i16 != -1) {
                        str4 = "NULL WALLET";
                    } else if (i16 != 1) {
                        if (i16 != 2) {
                            bVar = nVarI.f140513p.f100661b;
                            if (bVar != null) {
                                str4 = bVar.f100652a + "@" + bVar.f100653b.name();
                                i17 = i19;
                            } else {
                                str4 = ActionConst.NULL;
                            }
                        } else if (i16 != 3) {
                            str4 = "NOT SET";
                            i17 = i19;
                        } else {
                            if (i16 == 4) {
                                lc.u0.r();
                                return;
                            }
                            str4 = "FAILED TO GET";
                        }
                        textView10.setText("Owner: ".concat(str4));
                        textView10.setBackgroundColor(i17);
                        TextView textView11 = textView;
                        textView11.setVisibility(0);
                        if (nVarI != null && (dVar2 = nVarI.f140513p) != null && (eVar = dVar2.f100660a) != null && (strName = eVar.name()) != null) {
                            str3 = strName;
                        }
                        textView11.setText("Passcode: ".concat(str3));
                        if (nVarI != null || (dVar = nVarI.f140513p) == null) {
                            r14 = cVar;
                        } else {
                            r14 = dVar.f100660a;
                        }
                        i18 = r14 != null ? c.C1085a.f51945b[r14.ordinal()] : -1;
                        if (i18 != 1 && i18 != 2) {
                            i19 = i24;
                        }
                        textView11.setBackgroundColor(i19);
                        cVar3 = cVar4;
                    } else {
                        str4 = "UNKNOWN";
                    }
                    i17 = i24;
                    textView10.setText("Owner: ".concat(str4));
                    textView10.setBackgroundColor(i17);
                    TextView textView12 = textView;
                    textView12.setVisibility(0);
                    if (nVarI != null) {
                        str3 = strName;
                    }
                    textView12.setText("Passcode: ".concat(str3));
                    if (nVarI != null) {
                        r14 = cVar;
                    } else {
                        r14 = cVar;
                    }
                    if (r14 != null) {
                    }
                    if (i18 != 1) {
                        i19 = i24;
                    }
                    textView12.setBackgroundColor(i19);
                    cVar3 = cVar4;
                } else {
                    cVar = null;
                }
                w wVar2 = w.f140538a;
                long unitID3 = fVar.getUnitID();
                wVar2.getClass();
                nVarI = w.i(unitID3);
                if (!z14) {
                    if (z14) {
                        textView8.setText("no wallet");
                        view3.setBackgroundColor(aVar.f51926h);
                    } else {
                        textView8.setText("not connected");
                        view3.setBackgroundColor(i24);
                    }
                } else if (z14) {
                    textView8.setText("no wallet");
                    view3.setBackgroundColor(aVar.f51926h);
                } else {
                    textView8.setText("not connected");
                    view3.setBackgroundColor(i24);
                }
                imageView.setVisibility(0);
                textView8.setVisibility(0);
                view3.setVisibility(0);
                textView6.setVisibility(0);
                if (fVar.i1()) {
                    textView6.setBackgroundColor(i19);
                } else {
                    textView6.setBackgroundColor(i24);
                }
                textView7.setVisibility(0);
                if (nVarI != null) {
                    textView7.setText(nVarI.f140498a.getNfcInfo().getNfcChipType().name());
                    textView7.setBackgroundColor(i19);
                } else {
                    textView7.setText("(Not Available)");
                    textView7.setBackgroundColor(i24);
                }
                textView9.setVisibility(0);
                if (nVarI != null) {
                    textView9.setText(h0.k0(h0.N0(nVarI.f140498a.getNfcInfo().b(), new ir2.a()), "\n", null, null, null, 62));
                    textView9.setBackgroundColor(i19);
                } else {
                    textView9.setText("(Not available)");
                    textView9.setBackgroundColor(i24);
                }
                TextView textView13 = textView2;
                textView13.setVisibility(0);
                if (nVarI != null) {
                    cVar2 = cVar;
                } else {
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    i16 = -1;
                } else {
                    i16 = c.C1085a.f51944a[cVar2.ordinal()];
                }
                str3 = "NULL WALLET";
                if (i16 != -1) {
                    str4 = "NULL WALLET";
                } else if (i16 != 1) {
                    if (i16 != 2) {
                        bVar = nVarI.f140513p.f100661b;
                        if (bVar != null) {
                            str4 = bVar.f100652a + "@" + bVar.f100653b.name();
                            i17 = i19;
                        } else {
                            str4 = ActionConst.NULL;
                        }
                    } else if (i16 != 3) {
                        str4 = "NOT SET";
                        i17 = i19;
                    } else {
                        if (i16 == 4) {
                            lc.u0.r();
                            return;
                        }
                        str4 = "FAILED TO GET";
                    }
                    textView13.setText("Owner: ".concat(str4));
                    textView13.setBackgroundColor(i17);
                    TextView textView14 = textView;
                    textView14.setVisibility(0);
                    if (nVarI != null) {
                        str3 = strName;
                    }
                    textView14.setText("Passcode: ".concat(str3));
                    if (nVarI != null) {
                        r14 = cVar;
                    } else {
                        r14 = cVar;
                    }
                    if (r14 != null) {
                    }
                    if (i18 != 1) {
                        i19 = i24;
                    }
                    textView14.setBackgroundColor(i19);
                    cVar3 = cVar4;
                } else {
                    str4 = "UNKNOWN";
                }
                i17 = i24;
                textView13.setText("Owner: ".concat(str4));
                textView13.setBackgroundColor(i17);
                TextView textView15 = textView;
                textView15.setVisibility(0);
                if (nVarI != null) {
                    str3 = strName;
                }
                textView15.setText("Passcode: ".concat(str3));
                if (nVarI != null) {
                    r14 = cVar;
                } else {
                    r14 = cVar;
                }
                if (r14 != null) {
                }
                if (i18 != 1) {
                    i19 = i24;
                }
                textView15.setBackgroundColor(i19);
                cVar3 = cVar4;
            } else {
                cls = hn2.a.class;
            }
            zA = false;
            if (zA) {
                i15 = i19;
            } else {
                i15 = i24;
            }
            view2.setBackgroundColor(i15);
            if (zA) {
                drawable = aVar.f51922d;
            } else {
                drawable = aVar.f51923e;
            }
            imageView2.setImageDrawable(drawable);
            imageView2.setVisibility(0);
            if (zA) {
                charSequence = "connected";
            } else {
                charSequence = "not connected";
            }
            textView3.setText(charSequence);
            if (fVar.getUnitID() != 0) {
                cVar = null;
                if (((hn2.a) KoinJavaComponent.get$default(cls, null, null, 6, null)).i(fVar.d0()) != null) {
                }
                w wVar3 = w.f140538a;
                long unitID4 = fVar.getUnitID();
                wVar3.getClass();
                nVarI = w.i(unitID4);
                if (!z14) {
                    if (z14) {
                        textView8.setText("no wallet");
                        view3.setBackgroundColor(aVar.f51926h);
                    } else {
                        textView8.setText("not connected");
                        view3.setBackgroundColor(i24);
                    }
                } else if (z14) {
                    textView8.setText("no wallet");
                    view3.setBackgroundColor(aVar.f51926h);
                } else {
                    textView8.setText("not connected");
                    view3.setBackgroundColor(i24);
                }
                imageView.setVisibility(0);
                textView8.setVisibility(0);
                view3.setVisibility(0);
                textView6.setVisibility(0);
                if (fVar.i1()) {
                    textView6.setBackgroundColor(i19);
                } else {
                    textView6.setBackgroundColor(i24);
                }
                textView7.setVisibility(0);
                if (nVarI != null) {
                    textView7.setText(nVarI.f140498a.getNfcInfo().getNfcChipType().name());
                    textView7.setBackgroundColor(i19);
                } else {
                    textView7.setText("(Not Available)");
                    textView7.setBackgroundColor(i24);
                }
                textView9.setVisibility(0);
                if (nVarI != null) {
                    textView9.setText(h0.k0(h0.N0(nVarI.f140498a.getNfcInfo().b(), new ir2.a()), "\n", null, null, null, 62));
                    textView9.setBackgroundColor(i19);
                } else {
                    textView9.setText("(Not available)");
                    textView9.setBackgroundColor(i24);
                }
                TextView textView16 = textView2;
                textView16.setVisibility(0);
                if (nVarI != null) {
                    cVar2 = cVar;
                } else {
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    i16 = -1;
                } else {
                    i16 = c.C1085a.f51944a[cVar2.ordinal()];
                }
                str3 = "NULL WALLET";
                if (i16 != -1) {
                    str4 = "NULL WALLET";
                } else if (i16 != 1) {
                    if (i16 != 2) {
                        bVar = nVarI.f140513p.f100661b;
                        if (bVar != null) {
                            str4 = bVar.f100652a + "@" + bVar.f100653b.name();
                            i17 = i19;
                        } else {
                            str4 = ActionConst.NULL;
                        }
                    } else if (i16 != 3) {
                        str4 = "NOT SET";
                        i17 = i19;
                    } else {
                        if (i16 == 4) {
                            lc.u0.r();
                            return;
                        }
                        str4 = "FAILED TO GET";
                    }
                    textView16.setText("Owner: ".concat(str4));
                    textView16.setBackgroundColor(i17);
                    TextView textView17 = textView;
                    textView17.setVisibility(0);
                    if (nVarI != null) {
                        str3 = strName;
                    }
                    textView17.setText("Passcode: ".concat(str3));
                    if (nVarI != null) {
                        r14 = cVar;
                    } else {
                        r14 = cVar;
                    }
                    if (r14 != null) {
                    }
                    if (i18 != 1) {
                        i19 = i24;
                    }
                    textView17.setBackgroundColor(i19);
                    cVar3 = cVar4;
                } else {
                    str4 = "UNKNOWN";
                }
                i17 = i24;
                textView16.setText("Owner: ".concat(str4));
                textView16.setBackgroundColor(i17);
                TextView textView18 = textView;
                textView18.setVisibility(0);
                if (nVarI != null) {
                    str3 = strName;
                }
                textView18.setText("Passcode: ".concat(str3));
                if (nVarI != null) {
                    r14 = cVar;
                } else {
                    r14 = cVar;
                }
                if (r14 != null) {
                }
                if (i18 != 1) {
                    i19 = i24;
                }
                textView18.setBackgroundColor(i19);
                cVar3 = cVar4;
            } else {
                cVar = null;
            }
            w wVar4 = w.f140538a;
            long unitID5 = fVar.getUnitID();
            wVar4.getClass();
            nVarI = w.i(unitID5);
            if (!z14) {
                if (z14) {
                    textView8.setText("no wallet");
                    view3.setBackgroundColor(aVar.f51926h);
                } else {
                    textView8.setText("not connected");
                    view3.setBackgroundColor(i24);
                }
            } else if (z14) {
                textView8.setText("no wallet");
                view3.setBackgroundColor(aVar.f51926h);
            } else {
                textView8.setText("not connected");
                view3.setBackgroundColor(i24);
            }
            imageView.setVisibility(0);
            textView8.setVisibility(0);
            view3.setVisibility(0);
            textView6.setVisibility(0);
            if (fVar.i1()) {
                textView6.setBackgroundColor(i19);
            } else {
                textView6.setBackgroundColor(i24);
            }
            textView7.setVisibility(0);
            if (nVarI != null) {
                textView7.setText(nVarI.f140498a.getNfcInfo().getNfcChipType().name());
                textView7.setBackgroundColor(i19);
            } else {
                textView7.setText("(Not Available)");
                textView7.setBackgroundColor(i24);
            }
            textView9.setVisibility(0);
            if (nVarI != null) {
                textView9.setText(h0.k0(h0.N0(nVarI.f140498a.getNfcInfo().b(), new ir2.a()), "\n", null, null, null, 62));
                textView9.setBackgroundColor(i19);
            } else {
                textView9.setText("(Not available)");
                textView9.setBackgroundColor(i24);
            }
            TextView textView19 = textView2;
            textView19.setVisibility(0);
            if (nVarI != null) {
                cVar2 = cVar;
            } else {
                cVar2 = cVar;
            }
            if (cVar2 == null) {
                i16 = -1;
            } else {
                i16 = c.C1085a.f51944a[cVar2.ordinal()];
            }
            str3 = "NULL WALLET";
            if (i16 != -1) {
                str4 = "NULL WALLET";
            } else if (i16 != 1) {
                if (i16 != 2) {
                    bVar = nVarI.f140513p.f100661b;
                    if (bVar != null) {
                        str4 = bVar.f100652a + "@" + bVar.f100653b.name();
                        i17 = i19;
                    } else {
                        str4 = ActionConst.NULL;
                    }
                } else if (i16 != 3) {
                    str4 = "NOT SET";
                    i17 = i19;
                } else {
                    if (i16 == 4) {
                        lc.u0.r();
                        return;
                    }
                    str4 = "FAILED TO GET";
                }
                textView19.setText("Owner: ".concat(str4));
                textView19.setBackgroundColor(i17);
                TextView textView110 = textView;
                textView110.setVisibility(0);
                if (nVarI != null) {
                    str3 = strName;
                }
                textView110.setText("Passcode: ".concat(str3));
                if (nVarI != null) {
                    r14 = cVar;
                } else {
                    r14 = cVar;
                }
                if (r14 != null) {
                }
                if (i18 != 1) {
                    i19 = i24;
                }
                textView110.setBackgroundColor(i19);
                cVar3 = cVar4;
            } else {
                str4 = "UNKNOWN";
            }
            i17 = i24;
            textView19.setText("Owner: ".concat(str4));
            textView19.setBackgroundColor(i17);
            TextView textView111 = textView;
            textView111.setVisibility(0);
            if (nVarI != null) {
                str3 = strName;
            }
            textView111.setText("Passcode: ".concat(str3));
            if (nVarI != null) {
                r14 = cVar;
            } else {
                r14 = cVar;
            }
            if (r14 != null) {
            }
            if (i18 != 1) {
                i19 = i24;
            }
            textView111.setBackgroundColor(i19);
            cVar3 = cVar4;
        }
        cVar3.f51940m.setOnClickListener(new bv2.j(aVar, 12, cVar3, fVar));
        cVar3.itemView.setOnClickListener(new k(16, bVar2, fVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.device_card, viewGroup, false);
        viewE.getClass();
        return new c(this, viewE);
    }

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.dev.devices.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/ui/dev/devices/a$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1084a {
        public /* synthetic */ C1084a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1084a() {
        }
    }
}
