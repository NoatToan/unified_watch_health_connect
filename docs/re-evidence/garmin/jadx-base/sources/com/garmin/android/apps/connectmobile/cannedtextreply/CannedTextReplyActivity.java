package com.garmin.android.apps.connectmobile.cannedtextreply;

import am.j;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import c22.m2;
import c22.r;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.u;
import gw.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import og2.k;
import p005kotlin.Metadata;
import zy.f;
import zy.g;
import zy.i;
import zy.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/cannedtextreply/CannedTextReplyActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lzy/g;", "Lsq0/b;", "", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CannedTextReplyActivity extends com.garmin.android.apps.connectmobile.c implements g, sq0.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f31264o = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f31267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f31269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f31270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f31271g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f31276l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f31272h = new Handler();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f31273i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f31274j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31275k = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f31277m = new c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f31278n = new b();

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/garmin/android/apps/connectmobile/cannedtextreply/CannedTextReplyActivity$b", "Lzy/f;", "", "Lsd2/c;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements f<Set<? extends sd2.c>> {
        public b() {
        }

        @Override // zy.f
        public final void o(int i14) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "CannedTextReplyActivity", "onFail: Default canned message string resources missing. Fix me developer!");
            CannedTextReplyActivity cannedTextReplyActivity = CannedTextReplyActivity.this;
            cannedTextReplyActivity.hideProgressOverlay();
            Toast.makeText(cannedTextReplyActivity, cannedTextReplyActivity.getString(R.string.txt_error_occurred), 0).show();
            cannedTextReplyActivity.finish();
        }

        @Override // zy.f
        public final void onSuccess(Set<? extends sd2.c> set) {
            Set<? extends sd2.c> set2 = set;
            CannedTextReplyActivity cannedTextReplyActivity = CannedTextReplyActivity.this;
            cannedTextReplyActivity.hideProgressOverlay();
            if (set2 != null) {
                CannedTextReplyActivity.ca(cannedTextReplyActivity, set2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/garmin/android/apps/connectmobile/cannedtextreply/CannedTextReplyActivity$c", "Lzy/f;", "", "Lsd2/c;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements f<Set<? extends sd2.c>> {
        public c() {
        }

        @Override // zy.f
        public final void o(int i14) {
            CannedTextReplyActivity cannedTextReplyActivity = CannedTextReplyActivity.this;
            if (i14 == 1) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "CannedTextReplyActivity", "onFail: No cached data. Default init must be performed on BIC! Falling back to defaults.");
                a aVar2 = CannedTextReplyActivity.f31264o;
                cannedTextReplyActivity.fa();
                return;
            }
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var2, "CannedTextReplyActivity", "onFail: Fetch from local database failed.");
            cannedTextReplyActivity.hideProgressOverlay();
            Toast.makeText(cannedTextReplyActivity, cannedTextReplyActivity.getString(R.string.txt_error_occurred), 0).show();
            cannedTextReplyActivity.finish();
        }

        @Override // zy.f
        public final void onSuccess(Set<? extends sd2.c> set) {
            Set<? extends sd2.c> set2 = set;
            CannedTextReplyActivity cannedTextReplyActivity = CannedTextReplyActivity.this;
            cannedTextReplyActivity.hideProgressOverlay();
            if (set2 != null) {
                CannedTextReplyActivity.ca(cannedTextReplyActivity, set2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/cannedtextreply/CannedTextReplyActivity$d", "Lc22/m2;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends m2 {
        public d(int i14, Drawable drawable) {
            super(CannedTextReplyActivity.this, i14, drawable);
        }

        @Override // androidx.recyclerview.widget.s.d
        public final void o(int i14, RecyclerView.f0 f0Var) {
            f0Var.getClass();
            int bindingAdapterPosition = f0Var.getBindingAdapterPosition();
            if (bindingAdapterPosition > 0) {
                CannedTextReplyActivity.this.R(bindingAdapterPosition);
            }
        }

        @Override // c22.m2
        public final boolean p(RecyclerView.f0 f0Var) {
            f0Var.getClass();
            int bindingAdapterPosition = f0Var.getBindingAdapterPosition();
            if (bindingAdapterPosition <= 0) {
                return false;
            }
            ArrayList arrayList = CannedTextReplyActivity.this.f31269e;
            arrayList.getClass();
            l lVar = (l) arrayList.get(bindingAdapterPosition);
            lVar.getClass();
            return lVar.f207420g && lVar.f207419f == 1;
        }

        @Override // c22.m2
        public final boolean q(RecyclerView.f0 f0Var) {
            int bindingAdapterPosition;
            f0Var.getClass();
            CannedTextReplyActivity cannedTextReplyActivity = CannedTextReplyActivity.this;
            if (c22.b.f(cannedTextReplyActivity) || (bindingAdapterPosition = f0Var.getBindingAdapterPosition()) <= 0) {
                return false;
            }
            ArrayList arrayList = cannedTextReplyActivity.f31269e;
            arrayList.getClass();
            l lVar = (l) arrayList.get(bindingAdapterPosition);
            lVar.getClass();
            if (!lVar.f207420g) {
                return false;
            }
            int i14 = lVar.f207419f;
            return i14 == 1 || i14 == 3;
        }
    }

    public static final void ca(CannedTextReplyActivity cannedTextReplyActivity, Set set) {
        ArrayList arrayList = cannedTextReplyActivity.f31269e;
        arrayList.getClass();
        arrayList.clear();
        int i14 = cannedTextReplyActivity.f31266b == 1 ? 3 : 30;
        Iterator it = set.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            sd2.c cVar = (sd2.c) it.next();
            if (cVar != null) {
                int i16 = cVar.f158645e;
                String str = cVar.f158642b;
                if (cVar.f158643c == cannedTextReplyActivity.f31266b) {
                    if (!cVar.f158644d) {
                        str.getClass();
                        l lVar = new l(str, false, i16, 3);
                        ArrayList arrayList2 = cannedTextReplyActivity.f31269e;
                        arrayList2.getClass();
                        cannedTextReplyActivity.da(lVar, arrayList2.size(), false, false);
                    } else if (i15 < i14) {
                        str.getClass();
                        l lVar2 = new l(str, true, i16, 1);
                        ArrayList arrayList3 = cannedTextReplyActivity.f31269e;
                        arrayList3.getClass();
                        cannedTextReplyActivity.da(lVar2, arrayList3.size(), false, false);
                        i15++;
                    }
                }
            }
        }
        int i17 = cannedTextReplyActivity.f31266b;
        if (i17 == 0) {
            String string = cannedTextReplyActivity.getString(R.string.device_settings_responses_on_device);
            string.getClass();
            String string2 = cannedTextReplyActivity.getString(R.string.device_settings_text_response_info, cannedTextReplyActivity.f31268d);
            string2.getClass();
            l lVar3 = new l(string, string2, 0);
            ArrayList arrayList4 = cannedTextReplyActivity.f31269e;
            arrayList4.getClass();
            cannedTextReplyActivity.da(lVar3, arrayList4.size(), false, false);
        } else if (i17 == 1) {
            String string3 = cannedTextReplyActivity.getString(R.string.device_settings_responses_on_device_with_limit);
            string3.getClass();
            String string4 = cannedTextReplyActivity.getString(R.string.device_settings_call_response_info);
            string4.getClass();
            l lVar4 = new l(string3, string4, 0);
            ArrayList arrayList5 = cannedTextReplyActivity.f31269e;
            arrayList5.getClass();
            cannedTextReplyActivity.da(lVar4, arrayList5.size(), false, false);
        } else if (i17 == 3) {
            String string5 = cannedTextReplyActivity.getString(R.string.device_settings_responses_on_device);
            string5.getClass();
            String string6 = cannedTextReplyActivity.getString(R.string.group_ride_messages_info, cannedTextReplyActivity.f31268d);
            string6.getClass();
            l lVar5 = new l(string5, string6, 0);
            ArrayList arrayList6 = cannedTextReplyActivity.f31269e;
            arrayList6.getClass();
            cannedTextReplyActivity.da(lVar5, arrayList6.size(), false, false);
        }
        String string7 = cannedTextReplyActivity.getString(R.string.device_settings_more_responses);
        string7.getClass();
        l lVar6 = new l(string7, 2);
        ArrayList arrayList7 = cannedTextReplyActivity.f31269e;
        arrayList7.getClass();
        cannedTextReplyActivity.da(lVar6, arrayList7.size(), false, false);
        cannedTextReplyActivity.ia(false);
        Collections.sort(cannedTextReplyActivity.f31269e);
        i iVar = cannedTextReplyActivity.f31270f;
        iVar.getClass();
        iVar.notifyDataSetChanged();
    }

    @Override // zy.g
    public final void D(RecyclerView.f0 f0Var) {
        this.f31276l = true;
        s sVar = this.f31271g;
        sVar.getClass();
        sVar.o(f0Var);
    }

    @Override // zy.g
    public final void D0() {
        ja(null);
    }

    @Override // sq0.b
    public final int K0() {
        int i14;
        ArrayList arrayList = this.f31269e;
        arrayList.getClass();
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            ArrayList arrayList2 = this.f31269e;
            arrayList2.getClass();
            Object obj = arrayList2.get(i15);
            obj.getClass();
            if (((l) obj).f207419f == 1 && (i14 = i15 - 1) > 0) {
                ArrayList arrayList3 = this.f31269e;
                arrayList3.getClass();
                Object obj2 = arrayList3.get(i14);
                obj2.getClass();
                if (((l) obj2).f207419f == 0) {
                    return i15;
                }
            }
        }
        return 0;
    }

    @Override // zy.g
    public final void R(int i14) {
        if (this.f31273i) {
            this.f31273i = false;
            this.f31276l = true;
            ArrayList arrayList = this.f31269e;
            arrayList.getClass();
            Object obj = arrayList.get(i14);
            obj.getClass();
            ga(i14, true, ((l) obj).f207419f == 1);
            ia(true);
            this.f31272h.postDelayed(new zy.a(this, 0), 100L);
        }
    }

    @Override // zy.g
    @SuppressLint({"SwitchIntDef"})
    public final void Y2(int i14) {
        if (this.f31273i) {
            this.f31273i = false;
            this.f31276l = true;
            ArrayList arrayList = this.f31269e;
            arrayList.getClass();
            Object obj = arrayList.get(i14);
            obj.getClass();
            l lVar = (l) obj;
            int i15 = lVar.f207419f;
            if (i15 == 1 || i15 == 3) {
                int i16 = i15 != 1 ? 1 : 3;
                lVar.f207419f = i16;
                lVar.f207415b = i16 == 1;
                ga(i14, true, false);
                da(lVar, ea(lVar), true, true);
                ia(true);
            } else {
                String strH = j.h(i15, "onItemPerformMainAction: No main action associated with item type ");
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "CannedTextReplyActivity", strH);
            }
            this.f31272h.postDelayed(new zy.a(this, 1), 100L);
        }
    }

    public final void da(l lVar, int i14, boolean z14, boolean z15) {
        ArrayList arrayList = this.f31269e;
        arrayList.getClass();
        arrayList.add(i14, lVar);
        if (z14) {
            ha();
        }
        if (z15) {
            i iVar = this.f31270f;
            iVar.getClass();
            iVar.notifyItemInserted(i14);
        }
    }

    @SuppressLint({"SwitchIntDef"})
    public final int ea(l lVar) {
        int i14 = lVar.f207419f;
        int i15 = 0;
        if (i14 == 1) {
            int i16 = 0;
            while (true) {
                ArrayList arrayList = this.f31269e;
                arrayList.getClass();
                if (i16 >= arrayList.size()) {
                    return 0;
                }
                ArrayList arrayList2 = this.f31269e;
                arrayList2.getClass();
                Object obj = arrayList2.get(i16);
                obj.getClass();
                if (((l) obj).f207419f == 0) {
                    return i16 + 1;
                }
                i16++;
            }
        } else {
            if (i14 != 3) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "CannedTextReplyActivity", "getItemInsertionIndex called for wrong item type: " + lVar);
                return 0;
            }
            String str = lVar.f207414a;
            while (true) {
                ArrayList arrayList3 = this.f31269e;
                arrayList3.getClass();
                int size = arrayList3.size();
                ArrayList arrayList4 = this.f31269e;
                if (i15 >= size) {
                    arrayList4.getClass();
                    return arrayList4.size();
                }
                arrayList4.getClass();
                l lVar2 = (l) arrayList4.get(i15);
                lVar2.getClass();
                if (lVar2.f207419f == 3 && u.l(str, lVar2.f207414a) < 0) {
                    return i15;
                }
                i15++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0080  */
    @Override // sq0.b
    public final boolean f(int i14, int i15) {
        String string;
        this.f31276l = true;
        ArrayList arrayList = this.f31269e;
        arrayList.getClass();
        l lVar = (l) arrayList.get(i14);
        ArrayList arrayList2 = this.f31269e;
        arrayList2.getClass();
        l lVar2 = (l) arrayList2.get(i15);
        lVar.getClass();
        int i16 = lVar.f207416c;
        lVar2.getClass();
        lVar.f207416c = lVar2.f207416c;
        lVar2.f207416c = i16;
        Collections.swap(this.f31269e, i14, i15);
        i iVar = this.f31270f;
        iVar.getClass();
        iVar.notifyItemMoved(i14, i15);
        ArrayList arrayList3 = this.f31269e;
        arrayList3.getClass();
        if (i14 < arrayList3.size()) {
            ArrayList arrayList4 = this.f31269e;
            arrayList4.getClass();
            if (i15 < arrayList4.size()) {
                ArrayList arrayList5 = this.f31269e;
                arrayList5.getClass();
                Object obj = arrayList5.get(i14);
                obj.getClass();
                String strM = j.m("\"", ((l) obj).f207414a, "\"");
                if (i14 > i15) {
                    string = getString(R.string.lbl_move_above_value, strM);
                    string.getClass();
                } else {
                    string = getString(R.string.lbl_move_below_value, strM);
                    string.getClass();
                }
            } else {
                string = "";
            }
        } else {
            string = "";
        }
        c22.b.h(this, string);
        return true;
    }

    public final void fa() {
        this.f31276l = false;
        com.garmin.android.apps.connectmobile.cannedtextreply.a.f31282d.getClass();
        com.garmin.android.apps.connectmobile.cannedtextreply.a.C0505a.a().c(new k22.b(this), this.f31267c, this.f31265a, this.f31278n, this.f31266b);
    }

    public final void ga(int i14, boolean z14, boolean z15) {
        ArrayList arrayList = this.f31269e;
        arrayList.getClass();
        arrayList.remove(i14);
        if (z14) {
            i iVar = this.f31270f;
            iVar.getClass();
            iVar.notifyItemRemoved(i14);
        }
        if (z15) {
            ha();
        }
    }

    @Override // sq0.b
    public final void h8(int i14) {
    }

    public final void ha() {
        ArrayList arrayList = this.f31269e;
        arrayList.getClass();
        int size = arrayList.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            ArrayList arrayList2 = this.f31269e;
            arrayList2.getClass();
            l lVar = (l) arrayList2.get(i15);
            lVar.getClass();
            int i16 = lVar.f207419f;
            if (i16 == 1) {
                lVar.f207416c = i14;
                i14++;
            } else if (i16 == 2) {
                return;
            }
        }
    }

    public final void ia(boolean z14) {
        ArrayList arrayList;
        ArrayList<l> arrayList2 = this.f31269e;
        arrayList2.getClass();
        int i14 = 0;
        int i15 = 0;
        for (l lVar : arrayList2) {
            lVar.getClass();
            int i16 = lVar.f207419f;
            if (i16 == 1) {
                i14++;
            } else if (i16 == 3) {
                i15++;
            }
        }
        boolean z15 = i14 > 1;
        this.f31274j = i14 < (this.f31266b == 1 ? 3 : 30);
        ArrayList arrayList3 = this.f31269e;
        arrayList3.getClass();
        int size = arrayList3.size();
        int i17 = 0;
        while (true) {
            arrayList = this.f31269e;
            if (i17 >= size) {
                break;
            }
            arrayList.getClass();
            l lVar2 = (l) arrayList.get(i17);
            lVar2.getClass();
            int i18 = lVar2.f207419f;
            if (i18 == 1) {
                if (lVar2.f207420g != z15) {
                    lVar2.f207420g = z15;
                    if (z14) {
                        i iVar = this.f31270f;
                        iVar.getClass();
                        iVar.notifyItemChanged(i17);
                    }
                }
            } else if (i18 == 3) {
                boolean z16 = lVar2.f207420g;
                boolean z17 = this.f31274j;
                if (z16 != z17) {
                    lVar2.f207420g = z17;
                    if (z14) {
                        i iVar2 = this.f31270f;
                        iVar2.getClass();
                        iVar2.notifyItemChanged(i17);
                    }
                }
            } else if (i18 == 0) {
                boolean z18 = lVar2.f207420g;
                boolean z19 = this.f31274j;
                if (z18 != z19) {
                    lVar2.f207420g = z19;
                    i iVar3 = this.f31270f;
                    iVar3.getClass();
                    iVar3.notifyItemChanged(i17);
                }
            }
            i17++;
        }
        arrayList.getClass();
        int size2 = arrayList.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size2) {
                i19 = -1;
                break;
            }
            ArrayList arrayList4 = this.f31269e;
            arrayList4.getClass();
            Object obj = arrayList4.get(i19);
            obj.getClass();
            if (((l) obj).f207419f == 4) {
                break;
            } else {
                i19++;
            }
        }
        if (i15 != 0) {
            if (i19 != -1) {
                ga(i19, z14, false);
            }
        } else if (i19 == -1) {
            String string = getString(R.string.device_settings_no_responses_label);
            string.getClass();
            l lVar3 = new l(string, 4);
            ArrayList arrayList5 = this.f31269e;
            arrayList5.getClass();
            da(lVar3, arrayList5.size(), false, z14);
        }
    }

    public final void ja(String str) {
        com.garmin.android.apps.connectmobile.cannedtextreply.c.f31307c.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_DEFAULT_TEXT", str);
        com.garmin.android.apps.connectmobile.cannedtextreply.c cVar = new com.garmin.android.apps.connectmobile.cannedtextreply.c();
        cVar.setArguments(bundle);
        cVar.setCancelable(false);
        cVar.f31308a = this;
        cVar.show(getSupportFragmentManager(), (String) null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        HashSet hashSet;
        int i14;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("onBackPressed: mSaveTextReplies is ", this.f31276l);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "CannedTextReplyActivity", strH);
        if (this.f31276l) {
            r rVar = r.f23225a;
            long j8 = this.f31267c;
            int i15 = this.f31266b;
            ArrayList<l> arrayList = this.f31269e;
            rVar.getClass();
            if (arrayList == null || arrayList.isEmpty()) {
                hashSet = null;
            } else {
                HashSet hashSet2 = new HashSet();
                for (l lVar : arrayList) {
                    if (lVar != null && ((i14 = lVar.f207419f) == 1 || i14 == 3)) {
                        hashSet2.add(new sd2.c(j8, lVar.f207414a, i15, lVar.f207415b, lVar.f207416c));
                    }
                }
                if (hashSet2.isEmpty()) {
                    hashSet = null;
                } else {
                    hashSet = hashSet2;
                }
            }
            if (hashSet != null) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var2, "CannedTextReplyActivity", "onBackPressed: Saving canned text replies.");
                com.garmin.android.apps.connectmobile.cannedtextreply.a.f31282d.getClass();
                com.garmin.android.apps.connectmobile.cannedtextreply.a aVarA = com.garmin.android.apps.connectmobile.cannedtextreply.a.C0505a.a();
                long j14 = this.f31267c;
                int i16 = this.f31266b;
                aVarA.getClass();
                if (i16 == 0) {
                    cw.f.f55917b.getClass();
                    cw.f fVar = (cw.f) cw.f.f55918c.getValue();
                    fVar.getClass();
                    com.garmin.android.library.backgroundtaskmanagement.c.d(new j0(j14, hashSet, null, null, true, fVar), null);
                } else if (i16 == 1) {
                    cw.f.f55917b.getClass();
                    cw.f fVar2 = (cw.f) cw.f.f55918c.getValue();
                    fVar2.getClass();
                    com.garmin.android.library.backgroundtaskmanagement.c.d(new j0(j14, null, hashSet, null, true, fVar2), null);
                } else if (i16 == 3) {
                    cw.f.f55917b.getClass();
                    cw.f fVar3 = (cw.f) cw.f.f55918c.getValue();
                    fVar3.getClass();
                    com.garmin.android.library.backgroundtaskmanagement.c.d(new j0(j14, null, null, hashSet, true, fVar3), null);
                }
            }
        }
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "CannedTextReplyActivity", "onCreate: Activity not initialized properly, intent extras == null.");
            finish();
            return;
        }
        setContentView(R.layout.gcm3_recycler_view_layout);
        initActionBar(true, extras.getString("GCM_deviceSettingsTitle", ""));
        this.f31267c = extras.getLong("GCM_deviceUnitID", -1L);
        this.f31268d = extras.getString("GCM_deviceName", "");
        this.f31265a = extras.getString("GCM_deviceProductNbr", null);
        if (this.f31267c == -1) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var2, "CannedTextReplyActivity", "onCreate: Invalid initialization data.");
            finish();
            return;
        }
        View viewFindViewById = findViewById(R.id.recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
        itemAnimator.getClass();
        itemAnimator.f10316c = 100L;
        itemAnimator.f10317d = 100L;
        itemAnimator.f10319f = 100L;
        itemAnimator.f10318e = 100L;
        ArrayList arrayList = new ArrayList();
        this.f31269e = arrayList;
        i iVar = new i(arrayList, this);
        this.f31270f = iVar;
        recyclerView.setAdapter(iVar);
        int color = a7.b.getColor(this, R.color.gcm_surface_danger_action);
        Drawable drawable = a7.b.getDrawable(this, R.drawable.discard);
        k.F(R.color.gcm_icon_on_color, this, drawable);
        s sVar = new s(new d(color, drawable));
        this.f31271g = sVar;
        sVar.e(recyclerView);
        this.f31266b = extras.getInt("EXTRA_REPLY_TYPE", 0);
        showProgressOverlay();
        com.garmin.android.apps.connectmobile.cannedtextreply.a.f31282d.getClass();
        com.garmin.android.apps.connectmobile.cannedtextreply.a aVarA = com.garmin.android.apps.connectmobile.cannedtextreply.a.C0505a.a();
        long j8 = this.f31267c;
        int i14 = this.f31266b;
        aVarA.getClass();
        c cVar = this.f31277m;
        cVar.getClass();
        cw.f.f55917b.getClass();
        cw.f fVar = (cw.f) cw.f.f55918c.getValue();
        com.garmin.android.apps.connectmobile.cannedtextreply.a.b bVar = new com.garmin.android.apps.connectmobile.cannedtextreply.a.b(aVarA, cVar);
        fVar.getClass();
        com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.l(j8, i14, fVar), bVar);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.canned_text_reply_menu, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.text_reply_action_reset_to_default) {
            return super.onOptionsItemSelected(menuItem);
        }
        showProgressOverlay();
        fa();
        return true;
    }

    @Override // zy.g
    public final void s8(int i14) {
        this.f31275k = i14;
        ArrayList arrayList = this.f31269e;
        arrayList.getClass();
        Object obj = arrayList.get(this.f31275k);
        obj.getClass();
        ja(((l) obj).f207414a);
    }

    @Override // sq0.b
    public final int z1() {
        ArrayList arrayList = this.f31269e;
        arrayList.getClass();
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            ArrayList arrayList2 = this.f31269e;
            arrayList2.getClass();
            Object obj = arrayList2.get(i14);
            obj.getClass();
            if (((l) obj).f207419f == 2 && i14 > 0) {
                ArrayList arrayList3 = this.f31269e;
                arrayList3.getClass();
                Object obj2 = arrayList3.get(i14 - 1);
                obj2.getClass();
                if (((l) obj2).f207419f == 1) {
                    return i14;
                }
            }
        }
        return 0;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/cannedtextreply/CannedTextReplyActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_REPLY_TYPE", "", "MIN_REPLIES_ON_DEVICE", "I", "MAX_SMS_REPLIES_ON_DEVICE", "MAX_CALL_REPLIES_ON_DEVICE", "LIST_ANIM_DURATION_MILLIS", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(com.garmin.android.apps.connectmobile.c cVar, String str, long j8, String str2, String str3, int i14) {
            Intent intent = new Intent(cVar, (Class<?>) CannedTextReplyActivity.class);
            intent.putExtra("GCM_deviceSettingsTitle", str);
            intent.putExtra("GCM_deviceUnitID", j8);
            intent.putExtra("GCM_deviceName", str2);
            intent.putExtra("GCM_deviceProductNbr", str3);
            intent.putExtra("EXTRA_REPLY_TYPE", i14);
            cVar.startActivity(intent);
        }

        private a() {
        }
    }
}
