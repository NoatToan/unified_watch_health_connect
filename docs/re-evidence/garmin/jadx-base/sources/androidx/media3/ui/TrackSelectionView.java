package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.media3.common.e0;
import androidx.media3.common.f0;
import androidx.media3.common.h0;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kc.k;

/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f9992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CheckedTextView f9993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckedTextView f9994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f9995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f9996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f9997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f10000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CheckedTextView[][] f10001k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10002l;

    public class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            HashMap map = trackSelectionView.f9997g;
            boolean z14 = true;
            if (view2 == trackSelectionView.f9993c) {
                trackSelectionView.f10002l = true;
                map.clear();
            } else if (view2 == trackSelectionView.f9994d) {
                trackSelectionView.f10002l = false;
                map.clear();
            } else {
                trackSelectionView.f10002l = false;
                Object tag = view2.getTag();
                tag.getClass();
                c cVar = (c) tag;
                h0.a aVar = cVar.f10004a;
                e0 e0Var = aVar.f8304b;
                int i14 = cVar.f10005b;
                f0 f0Var = (f0) map.get(e0Var);
                if (f0Var == null) {
                    if (!trackSelectionView.f9999i && map.size() > 0) {
                        map.clear();
                    }
                    map.put(e0Var, new f0(e0Var, ImmutableList.of(Integer.valueOf(i14))));
                } else {
                    ArrayList arrayList = new ArrayList(f0Var.f8224b);
                    boolean zIsChecked = ((CheckedTextView) view2).isChecked();
                    boolean z15 = trackSelectionView.f9998h && aVar.f8305c;
                    if (!z15 && (!trackSelectionView.f9999i || trackSelectionView.f9996f.size() <= 1)) {
                        z14 = false;
                    }
                    if (zIsChecked && z14) {
                        arrayList.remove(Integer.valueOf(i14));
                        if (arrayList.isEmpty()) {
                            map.remove(e0Var);
                        } else {
                            map.put(e0Var, new f0(e0Var, arrayList));
                        }
                    } else if (!zIsChecked) {
                        if (z15) {
                            arrayList.add(Integer.valueOf(i14));
                            map.put(e0Var, new f0(e0Var, arrayList));
                        } else {
                            map.put(e0Var, new f0(e0Var, ImmutableList.of(Integer.valueOf(i14))));
                        }
                    }
                }
            }
            trackSelectionView.a();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h0.a f10004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10005b;

        public c(h0.a aVar, int i14) {
            this.f10004a = aVar;
            this.f10005b = i14;
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f9991a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f9992b = layoutInflaterFrom;
        b bVar = new b();
        this.f9995e = bVar;
        this.f10000j = new kc.b(getResources());
        this.f9996f = new ArrayList();
        this.f9997g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f9993c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.garmin.android.apps.connectmobile.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(com.garmin.android.apps.connectmobile.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f9994d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.garmin.android.apps.connectmobile.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    public final void a() {
        this.f9993c.setChecked(this.f10002l);
        boolean z14 = this.f10002l;
        HashMap map = this.f9997g;
        this.f9994d.setChecked(!z14 && map.size() == 0);
        for (int i14 = 0; i14 < this.f10001k.length; i14++) {
            f0 f0Var = (f0) map.get(((h0.a) this.f9996f.get(i14)).f8304b);
            int i15 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f10001k[i14];
                if (i15 < checkedTextViewArr.length) {
                    if (f0Var != null) {
                        Object tag = checkedTextViewArr[i15].getTag();
                        tag.getClass();
                        this.f10001k[i14][i15].setChecked(f0Var.f8224b.contains(Integer.valueOf(((c) tag).f10005b)));
                    } else {
                        checkedTextViewArr[i15].setChecked(false);
                    }
                    i15++;
                }
            }
        }
    }

    public final void b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f9996f;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f9994d;
        CheckedTextView checkedTextView2 = this.f9993c;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f10001k = new CheckedTextView[arrayList.size()][];
        boolean z14 = this.f9999i && arrayList.size() > 1;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            h0.a aVar = (h0.a) arrayList.get(i14);
            boolean z15 = this.f9998h && aVar.f8305c;
            CheckedTextView[][] checkedTextViewArr = this.f10001k;
            int i15 = aVar.f8303a;
            checkedTextViewArr[i14] = new CheckedTextView[i15];
            c[] cVarArr = new c[i15];
            for (int i16 = 0; i16 < aVar.f8303a; i16++) {
                cVarArr[i16] = new c(aVar, i16);
            }
            for (int i17 = 0; i17 < i15; i17++) {
                LayoutInflater layoutInflater = this.f9992b;
                if (i17 == 0) {
                    addView(layoutInflater.inflate(com.garmin.android.apps.connectmobile.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z15 || z14) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f9991a);
                k kVar = this.f10000j;
                c cVar = cVarArr[i17];
                checkedTextView3.setText(kVar.a(cVar.f10004a.f8304b.f8217d[cVar.f10005b]));
                checkedTextView3.setTag(cVarArr[i17]);
                if (aVar.a(i17)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f9995e);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.f10001k[i14][i17] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.f10002l;
    }

    public Map<e0, f0> getOverrides() {
        return this.f9997g;
    }

    public void setAllowAdaptiveSelections(boolean z14) {
        if (this.f9998h != z14) {
            this.f9998h = z14;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z14) {
        if (this.f9999i != z14) {
            this.f9999i = z14;
            if (!z14) {
                HashMap map = this.f9997g;
                if (map.size() > 1) {
                    HashMap map2 = new HashMap();
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList = this.f9996f;
                        if (i14 >= arrayList.size()) {
                            break;
                        }
                        f0 f0Var = (f0) map.get(((h0.a) arrayList.get(i14)).f8304b);
                        if (f0Var != null && map2.isEmpty()) {
                            map2.put(f0Var.f8223a, f0Var);
                        }
                        i14++;
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z14) {
        this.f9993c.setVisibility(z14 ? 0 : 8);
    }

    public void setTrackNameProvider(k kVar) {
        kVar.getClass();
        this.f10000j = kVar;
        b();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }
}
