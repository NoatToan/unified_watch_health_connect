package com.garmin.android.apps.connectmobile.segments.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.x1;
import cg1.c0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.segments.SegmentsFilterDTO;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsListDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.view.SlidingUpPanelLayout;
import com.google.android.gms.maps.model.LatLng;
import com.google.mlkit.common.MlKitException;
import e23.p;
import ie2.j;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import o13.r;
import o53.b0;
import o53.c2;
import o53.f0;
import o53.m0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/ExploreSegmentsActivity;", "Lxf1/c;", "Lcom/garmin/android/apps/connectmobile/segments/presentation/b$b;", "Lcom/garmin/android/apps/connectmobile/view/SlidingUpPanelLayout$c;", "<init>", "()V", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ExploreSegmentsActivity extends xf1.c implements com.garmin.android.apps.connectmobile.segments.presentation.b.InterfaceC0786b {
    public static final a C = new a(null);
    public final bl0.a A = new bl0.a(this, 2);
    public c2 B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.e f41346r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SegmentsFilterDTO f41347t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f41348v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Menu f41349w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ViewGroup f41350x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public EditText f41351y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c0 f41352z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.segments.presentation.ExploreSegmentsActivity$onActivityResult$1", f = "ExploreSegmentsActivity.kt", l = {161}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f41353a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return ExploreSegmentsActivity.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f41353a;
            if (i14 == 0) {
                r.b(obj);
                ExploreSegmentsActivity exploreSegmentsActivity = ExploreSegmentsActivity.this;
                com.garmin.android.library.mapsdkadapter.e eVar = exploreSegmentsActivity.f41346r;
                this.f41353a = 1;
                if (ExploreSegmentsActivity.la(exploreSegmentsActivity, eVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.segments.presentation.ExploreSegmentsActivity$onBoundsChanged$1", f = "ExploreSegmentsActivity.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f41355a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.mapsdkadapter.e f41357c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.garmin.android.library.mapsdkadapter.e eVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f41357c = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return ExploreSegmentsActivity.this.new c(this.f41357c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f41355a;
            if (i14 == 0) {
                r.b(obj);
                this.f41355a = 1;
                if (ExploreSegmentsActivity.la(ExploreSegmentsActivity.this, this.f41357c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.segments.presentation.ExploreSegmentsActivity$onBoundsChanged$2", f = "ExploreSegmentsActivity.kt", l = {MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 208}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f41358a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.mapsdkadapter.e f41360c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.garmin.android.library.mapsdkadapter.e eVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f41360c = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return ExploreSegmentsActivity.this.new d(this.f41360c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        
            if (com.garmin.android.apps.connectmobile.segments.presentation.ExploreSegmentsActivity.la(r5.f41359b, r5.f41360c, r5) == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f41358a;
            if (i14 == 0) {
                r.b(obj);
                this.f41358a = 1;
                if (m0.b(500L, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
            this.f41358a = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.segments.presentation.ExploreSegmentsActivity$onCreate$1$1", f = "ExploreSegmentsActivity.kt", l = {77}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f41361a;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return ExploreSegmentsActivity.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f41361a;
            if (i14 == 0) {
                r.b(obj);
                ExploreSegmentsActivity exploreSegmentsActivity = ExploreSegmentsActivity.this;
                com.garmin.android.library.mapsdkadapter.e eVar = exploreSegmentsActivity.f41346r;
                this.f41361a = 1;
                if (ExploreSegmentsActivity.la(exploreSegmentsActivity, eVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Object la(ExploreSegmentsActivity exploreSegmentsActivity, com.garmin.android.library.mapsdkadapter.e eVar, v13.i iVar) {
        exploreSegmentsActivity.getClass();
        i2.a.c(i2.f36769a, "ExploreSegmentsActivity", "searchSegments: " + eVar);
        if (eVar == null) {
            return Unit.INSTANCE;
        }
        LatLng latLng = eVar.f50274b.f50283a;
        LatLng latLng2 = eVar.f50273a.f50283a;
        if (exploreSegmentsActivity.f41347t == null) {
            exploreSegmentsActivity.f41347t = new SegmentsFilterDTO(0, 50);
        }
        SegmentsFilterDTO segmentsFilterDTO = exploreSegmentsActivity.f41347t;
        segmentsFilterDTO.getClass();
        segmentsFilterDTO.f41190b = latLng2.latitude;
        SegmentsFilterDTO segmentsFilterDTO2 = exploreSegmentsActivity.f41347t;
        segmentsFilterDTO2.getClass();
        segmentsFilterDTO2.f41192d = latLng2.longitude;
        SegmentsFilterDTO segmentsFilterDTO3 = exploreSegmentsActivity.f41347t;
        segmentsFilterDTO3.getClass();
        segmentsFilterDTO3.f41191c = latLng.latitude;
        SegmentsFilterDTO segmentsFilterDTO4 = exploreSegmentsActivity.f41347t;
        segmentsFilterDTO4.getClass();
        segmentsFilterDTO4.f41193e = latLng.longitude;
        SegmentsFilterDTO segmentsFilterDTO5 = exploreSegmentsActivity.f41347t;
        segmentsFilterDTO5.getClass();
        EditText editText = exploreSegmentsActivity.f41351y;
        editText.getClass();
        segmentsFilterDTO5.f41189a = editText.getText().toString();
        SegmentsFilterDTO segmentsFilterDTO6 = exploreSegmentsActivity.f41347t;
        segmentsFilterDTO6.getClass();
        segmentsFilterDTO6.f41198j = false;
        Object objMa = exploreSegmentsActivity.ma(iVar);
        return objMa == u13.a.COROUTINE_SUSPENDED ? objMa : Unit.INSTANCE;
    }

    @Override // com.garmin.android.apps.connectmobile.segments.presentation.b.InterfaceC0786b
    public final void N5() {
        if (this.f41346r != null) {
            Intent intent = new Intent(this, (Class<?>) ExploreSegmentsFilterActivity.class);
            intent.putExtra("extra_segment_leaderboard_filter_on", this.f41348v);
            startActivityForResult(intent, 1);
        }
    }

    @Override // xf1.c
    public final int ca() {
        ViewGroup viewGroup = this.f190637c;
        if (viewGroup != null) {
            return viewGroup.getHeight();
        }
        return 0;
    }

    @Override // xf1.c
    /* JADX INFO: renamed from: ea */
    public final xf1.d getF190646l() {
        xf1.d dVar = this.f190646l;
        if (dVar instanceof com.garmin.android.apps.connectmobile.segments.presentation.b) {
            return (com.garmin.android.apps.connectmobile.segments.presentation.b) dVar;
        }
        return null;
    }

    @Override // com.garmin.android.apps.connectmobile.segments.presentation.b.InterfaceC0786b
    public final void f0(com.garmin.android.library.mapsdkadapter.e eVar) {
        i2.a.c(i2.f36769a, "ExploreSegmentsActivity", "onBoundsChanged: " + eVar);
        this.f41346r = eVar;
        c2 c2Var = this.B;
        if (c2Var == null) {
            this.B = ge1.b.T(f0.w(this), null, null, new c(eVar, null), 3);
        } else {
            c2Var.c(null);
            this.B = ge1.b.T(f0.w(this), null, null, new d(eVar, null), 3);
        }
    }

    @Override // xf1.c, xf1.d.a
    public final void f2(j jVar, long j8) {
        super.f2(jVar, j8);
        ViewGroup viewGroup = this.f41350x;
        viewGroup.getClass();
        viewGroup.requestFocus();
    }

    @Override // xf1.c
    public final xf1.d ha() {
        return new com.garmin.android.apps.connectmobile.segments.presentation.b();
    }

    @Override // xf1.c
    public final void ja(xf1.d dVar) {
        this.f190646l = dVar instanceof com.garmin.android.apps.connectmobile.segments.presentation.b ? (com.garmin.android.apps.connectmobile.segments.presentation.b) dVar : null;
    }

    @Override // xf1.c
    public final void ka(xf1.c.b bVar) {
        MenuItem menuItemFindItem;
        bVar.getClass();
        super.ka(bVar);
        Menu menu = this.f41349w;
        if (menu != null && (menuItemFindItem = menu.findItem(R.id.menu_list_map_item)) != null) {
            menuItemFindItem.setTitle(getString(bVar == xf1.c.b.LIST ? R.string.lbl_map : R.string.lbl_list));
        }
        int i14 = bVar == xf1.c.b.LIST ? 8 : 0;
        ViewGroup viewGroup = this.f41350x;
        viewGroup.getClass();
        viewGroup.requestFocus();
        EditText editText = this.f41351y;
        editText.getClass();
        editText.setVisibility(i14);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00de A[EDGE_INSN: B:101:0x00de->B:69:0x00de BREAK  A[LOOP:0: B:39:0x0088->B:103:0x0088], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:38:0x0086  */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:81:0x0102  */
    /* JADX WARN: Code duplicated, block: B:83:0x0105  */
    /* JADX WARN: Code duplicated, block: B:85:0x010c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0110  */
    /* JADX WARN: Code duplicated, block: B:88:0x0116  */
    /* JADX WARN: Code duplicated, block: B:90:0x011c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0150  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object ma(v13.c cVar) {
        cg1.b bVar;
        v2 v2Var;
        xf1.d f190646l;
        xf1.d f190646l2;
        Exception exc;
        xf1.d f190646l3;
        ArrayList<SegmentDetailsDTO> arrayList;
        ArrayList<SegmentDetailsDTO> arrayList2;
        xf1.j jVar;
        xf1.d f190646l4;
        ArrayList<SegmentDetailsDTO> arrayList3;
        com.garmin.android.apps.connectmobile.segments.presentation.b bVar2;
        ArrayList arrayListZ;
        int i14;
        int size;
        SegmentDetailsDTO segmentDetailsDTO;
        ArrayList arrayList4;
        ArrayList arrayList5;
        com.garmin.android.apps.connectmobile.segments.model.a aVar;
        double d14;
        com.garmin.android.library.mapsdkadapter.e eVar;
        ArrayList<SegmentDetailsDTO> arrayList6;
        if (cVar instanceof cg1.b) {
            bVar = (cg1.b) cVar;
            int i15 = bVar.f27128c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                bVar.f27128c = i15 - Integer.MIN_VALUE;
            } else {
                bVar = new cg1.b(this, cVar);
            }
        } else {
            bVar = new cg1.b(this, cVar);
        }
        Object objJ = bVar.f27126a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = bVar.f27128c;
        if (i16 == 0) {
            r.b(objJ);
            if (this.f190648n == xf1.c.b.MAP && (f190646l = getF190646l()) != null) {
                g22.e.l(f190646l);
            }
            showProgressOverlay();
            c0 c0Var = this.f41352z;
            if (c0Var != null) {
                SegmentsFilterDTO segmentsFilterDTO = this.f41347t;
                if (segmentsFilterDTO == null) {
                    return Unit.INSTANCE;
                }
                bVar.f27128c = 1;
                yf1.b bVar3 = c0Var.f27136b;
                bVar3.getClass();
                objJ = com.garmin.android.apps.connectmobile.f0.J(bVar3, new yf1.j(bVar3, segmentsFilterDTO, null), bVar);
                if (objJ == aVar2) {
                    return aVar2;
                }
            } else {
                v2Var = null;
            }
            if (v2Var instanceof v2.b) {
                hideProgressOverlay();
                arrayList = this.f190649o;
                if (arrayList == null) {
                    this.f190649o = new ArrayList<>();
                } else {
                    arrayList.clear();
                }
                arrayList2 = ((SegmentDetailsListDTO) ((v2.b) v2Var).f47386a).f41284a;
                if (arrayList2 != null) {
                    i14 = 0;
                    while (true) {
                        if (arrayList2 != null) {
                            size = arrayList2.size();
                        } else {
                            size = 0;
                        }
                        if (i14 < size) {
                            break;
                        }
                        if (arrayList2 != null) {
                            segmentDetailsDTO = arrayList2.get(i14);
                        } else {
                            segmentDetailsDTO = null;
                        }
                        if (segmentDetailsDTO == null) {
                            arrayList4 = segmentDetailsDTO.f41283x;
                            if (arrayList4 != null && arrayList4.size() > 0) {
                                arrayList5 = segmentDetailsDTO.f41283x;
                                if (arrayList5 != null) {
                                    aVar = (com.garmin.android.apps.connectmobile.segments.model.a) arrayList5.get(0);
                                } else {
                                    aVar = null;
                                }
                                if (aVar != null) {
                                    d14 = aVar.f41341a;
                                } else {
                                    d14 = 0.0d;
                                }
                                com.garmin.android.library.mapsdkadapter.f fVar = new com.garmin.android.library.mapsdkadapter.f(d14, aVar != null ? aVar.f41342b : 0.0d, com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                                eVar = this.f41346r;
                                if (eVar != null && eVar.b(fVar) && (arrayList6 = this.f190649o) != null) {
                                    arrayList6.add(segmentDetailsDTO);
                                }
                            }
                            i14++;
                        }
                    }
                }
                if (this.f190648n == xf1.c.b.MAP) {
                    f190646l4 = getF190646l();
                    if (f190646l4 != null) {
                        g22.e.f(f190646l4);
                    }
                    if (f190646l4 != null) {
                        arrayList3 = this.f190649o;
                        bVar2 = (com.garmin.android.apps.connectmobile.segments.presentation.b) f190646l4;
                        if (bVar2.f148294e != null && !bVar2.f190663m) {
                            if (arrayList3 != null) {
                                arrayListZ = h0.Z(arrayList3);
                            } else {
                                arrayListZ = null;
                            }
                            ArrayList arrayList7 = arrayListZ != null ? arrayListZ : null;
                            bVar2.f190664n = arrayList7;
                            bVar2.z6(arrayList7);
                        }
                    }
                } else {
                    jVar = this.f190647m;
                    if (jVar != null) {
                        jVar.z6(this.f190649o);
                    }
                }
            } else {
                f190646l2 = getF190646l();
                if (f190646l2 != null) {
                    g22.e.f(f190646l2);
                }
                v2Var.getClass();
                exc = ((v2.a) v2Var).f47383a;
                i2.a.j(i2.f36769a, "ExploreSegmentsActivity", "fetchSegments(): " + exc);
                if (!(exc.getCause() instanceof CancellationException) && !(exc instanceof CancellationException)) {
                    displayFailedMessage();
                }
                f190646l3 = getF190646l();
                if (f190646l3 != null) {
                    g22.e.f(f190646l3);
                }
            }
            return Unit.INSTANCE;
        }
        if (i16 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objJ);
        v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            hideProgressOverlay();
            arrayList = this.f190649o;
            if (arrayList == null) {
                this.f190649o = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            arrayList2 = ((SegmentDetailsListDTO) ((v2.b) v2Var).f47386a).f41284a;
            if (arrayList2 != null) {
                i14 = 0;
                while (true) {
                    if (arrayList2 != null) {
                        size = arrayList2.size();
                    } else {
                        size = 0;
                    }
                    if (i14 < size) {
                        break;
                        break;
                    }
                    if (arrayList2 != null) {
                        segmentDetailsDTO = arrayList2.get(i14);
                    } else {
                        segmentDetailsDTO = null;
                    }
                    if (segmentDetailsDTO == null) {
                        arrayList4 = segmentDetailsDTO.f41283x;
                        if (arrayList4 != null) {
                            arrayList5 = segmentDetailsDTO.f41283x;
                            if (arrayList5 != null) {
                                aVar = (com.garmin.android.apps.connectmobile.segments.model.a) arrayList5.get(0);
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                d14 = aVar.f41341a;
                            } else {
                                d14 = 0.0d;
                            }
                            com.garmin.android.library.mapsdkadapter.f fVar2 = new com.garmin.android.library.mapsdkadapter.f(d14, aVar != null ? aVar.f41342b : 0.0d, com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                            eVar = this.f41346r;
                            if (eVar != null) {
                                arrayList6.add(segmentDetailsDTO);
                            }
                        }
                        i14++;
                    }
                }
            }
            if (this.f190648n == xf1.c.b.MAP) {
                f190646l4 = getF190646l();
                if (f190646l4 != null) {
                    g22.e.f(f190646l4);
                }
                if (f190646l4 != null) {
                    arrayList3 = this.f190649o;
                    bVar2 = (com.garmin.android.apps.connectmobile.segments.presentation.b) f190646l4;
                    if (bVar2.f148294e != null) {
                        if (arrayList3 != null) {
                            arrayListZ = h0.Z(arrayList3);
                        } else {
                            arrayListZ = null;
                        }
                        if (arrayListZ != null) {
                        }
                        bVar2.f190664n = arrayList7;
                        bVar2.z6(arrayList7);
                    }
                }
            } else {
                jVar = this.f190647m;
                if (jVar != null) {
                    jVar.z6(this.f190649o);
                }
            }
        } else {
            f190646l2 = getF190646l();
            if (f190646l2 != null) {
                g22.e.f(f190646l2);
            }
            v2Var.getClass();
            exc = ((v2.a) v2Var).f47383a;
            i2.a.j(i2.f36769a, "ExploreSegmentsActivity", "fetchSegments(): " + exc);
            if (!(exc.getCause() instanceof CancellationException)) {
                displayFailedMessage();
            }
            f190646l3 = getF190646l();
            if (f190646l3 != null) {
                g22.e.f(f190646l3);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // xf1.c, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        SegmentsFilterDTO segmentsFilterDTO;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 1 && i15 == -1) {
            intent.getClass();
            boolean booleanExtra = intent.getBooleanExtra("extra_segment_leaderboard_filter_on", false);
            this.f41348v = booleanExtra;
            if (booleanExtra) {
                segmentsFilterDTO = g.f41446b.a() != null ? ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).c(this) : null;
            } else {
                segmentsFilterDTO = new SegmentsFilterDTO();
            }
            this.f41347t = segmentsFilterDTO;
            segmentsFilterDTO.getClass();
            segmentsFilterDTO.f41194f = 0;
            SegmentsFilterDTO segmentsFilterDTO2 = this.f41347t;
            segmentsFilterDTO2.getClass();
            segmentsFilterDTO2.f41195g = 50;
            ge1.b.T(f0.w(this), null, null, new b(null), 3);
        }
    }

    @Override // xf1.c, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        super.onCreate(bundle);
        setContentView(R.layout.gcm_explore_segments);
        initActionBar(true, R.string.card_segments_title);
        View viewFindViewById = findViewById(R.id.segments_explore_container);
        viewFindViewById.getClass();
        this.f41350x = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.segments_explore_search_field);
        viewFindViewById2.getClass();
        EditText editText = (EditText) viewFindViewById2;
        this.f41351y = editText;
        editText.setOnEditorActionListener(this.A);
        EditText editText2 = this.f41351y;
        editText2.getClass();
        editText2.setOnFocusChangeListener(new c32.f(this, 1));
        View viewFindViewById3 = findViewById(R.id.segments_explore_slide_layout);
        viewFindViewById3.getClass();
        SlidingUpPanelLayout slidingUpPanelLayout = (SlidingUpPanelLayout) viewFindViewById3;
        this.f190636b = slidingUpPanelLayout;
        slidingUpPanelLayout.setPanelSlideListener(this);
        View viewFindViewById4 = findViewById(R.id.segments_details_container);
        viewFindViewById4.getClass();
        this.f190637c = (ViewGroup) viewFindViewById4;
        ga();
        if (c22.b.a(this) >= 1.5f && (viewGroup = this.f190637c) != null) {
            viewGroup.setLayoutParams(new SlidingUpPanelLayout.b(-1, -2));
        }
        this.f41352z = (c0) new x1(this).b(s0.f105811a.b(c0.class));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        this.f41349w = menu;
        getMenuInflater().inflate(R.menu.explore_segments, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == R.id.menu_list_map_item) {
            xf1.c.b bVar = this.f190648n;
            if (bVar != null && bVar == xf1.c.b.MAP) {
                ViewGroup viewGroup = this.f41350x;
                viewGroup.getClass();
                viewGroup.requestFocus();
                ka(xf1.c.b.LIST);
            } else if (bVar != null && bVar == xf1.c.b.LIST) {
                ka(xf1.c.b.MAP);
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        menu.findItem(R.id.menu_list_map_item).setTitle(getString(this.f190648n == xf1.c.b.MAP ? R.string.lbl_list : R.string.lbl_map));
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        i2.a.c(i2.f36769a, "ExploreSegmentsActivity", "onRequestPermissionsResult");
        if (i14 != 2) {
            super.onRequestPermissionsResult(i14, strArr, iArr);
            return;
        }
        j22.b.f96736a.getClass();
        if (j22.b.E(iArr)) {
            return;
        }
        Toast.makeText(this, j22.b.f(j22.a.f96719h), 1).show();
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        j22.b bVar = j22.b.f96736a;
        j22.a aVar = j22.a.f96719h;
        bVar.getClass();
        if (j22.b.k(aVar)) {
            i2.a.c(i2.f36769a, "ExploreSegmentsActivity", "onResume:calling switchFragment with FragType.MAP");
            if (this.f190648n == xf1.c.b.NONE) {
                ka(xf1.c.b.MAP);
                return;
            }
            return;
        }
        i2.a aVar2 = i2.f36769a;
        i2.a.c(aVar2, "ExploreSegmentsActivity", "onResume:location perm off");
        v vVar = this.f190645k;
        Fragment fragmentG = vVar != null ? vVar.G(xf1.c.b.MAP.f190655a) : null;
        if (fragmentG != null) {
            v vVar2 = this.f190645k;
            if (vVar2 != null) {
                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(vVar2);
                aVar3.k(fragmentG);
                aVar3.s(true, true);
            }
            i2.a.c(aVar2, "ExploreSegmentsActivity", "onResume:removed map frag");
        }
        v vVar3 = this.f190645k;
        Fragment fragmentG2 = vVar3 != null ? vVar3.G(xf1.c.b.LIST.f190655a) : null;
        if (fragmentG2 != null) {
            v vVar4 = this.f190645k;
            if (vVar4 != null) {
                androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(vVar4);
                aVar4.k(fragmentG2);
                aVar4.s(true, true);
            }
            i2.a.c(aVar2, "ExploreSegmentsActivity", "onResume:removed list frag");
        }
        i2.a.c(aVar2, "ExploreSegmentsActivity", "onResume:requesting location perm");
        j22.b.x(this, 2, aVar);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/ExploreSegmentsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "FILTER_REQUEST_CODE", "I", "REQUEST_CODE_PERM_LOCATION", "SEGMENTS_START_INDEX", "SEGMENTS_LIMIT_INDEX", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
