package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public class TrackSelectionView extends LinearLayout {
    private final int a;
    private final LayoutInflater b;
    private final CheckedTextView c;
    private final CheckedTextView d;
    private final b e;
    private final SparseArray<DefaultTrackSelector.SelectionOverride> f;
    private boolean g;
    private boolean h;
    private TrackNameProvider i;
    private CheckedTextView[][] j;
    private MappingTrackSelector.MappedTrackInfo k;
    private int l;
    private TrackGroupArray m;
    private boolean n;

    @Nullable
    private Comparator<c> o;

    @Nullable
    private TrackSelectionListener p;

    public interface TrackSelectionListener {
        void onTrackSelectionChanged(boolean isDisabled, List<DefaultTrackSelector.SelectionOverride> overrides);
    }

    public class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.onClick(view);
        }
    }

    public static final class c {
        public final int a;
        public final int b;
        public final Format c;

        public c(int groupIndex, int trackIndex, Format format) {
            this.a = groupIndex;
            this.b = trackIndex;
            this.c = format;
        }
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    private static int[] c(int[] tracks, int addedTrack) {
        int[] iArrCopyOf = Arrays.copyOf(tracks, tracks.length + 1);
        iArrCopyOf[iArrCopyOf.length - 1] = addedTrack;
        return iArrCopyOf;
    }

    private static int[] d(int[] tracks, int removedTrack) {
        int[] iArr = new int[tracks.length - 1];
        int i = 0;
        for (int i2 : tracks) {
            if (i2 != removedTrack) {
                iArr[i] = i2;
                i++;
            }
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(Comparator comparator, c cVar, c cVar2) {
        return comparator.compare(cVar.c, cVar2.c);
    }

    private void f() {
        this.n = false;
        this.f.clear();
    }

    private void g() {
        this.n = true;
        this.f.clear();
    }

    private void h(View view) {
        this.n = false;
        c cVar = (c) Assertions.checkNotNull(view.getTag());
        int i = cVar.a;
        int i2 = cVar.b;
        DefaultTrackSelector.SelectionOverride selectionOverride = this.f.get(i);
        Assertions.checkNotNull(this.k);
        if (selectionOverride == null) {
            if (!this.h && this.f.size() > 0) {
                this.f.clear();
            }
            this.f.put(i, new DefaultTrackSelector.SelectionOverride(i, i2));
            return;
        }
        int i3 = selectionOverride.length;
        int[] iArr = selectionOverride.tracks;
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zI = i(i);
        boolean z = zI || j();
        if (zIsChecked && z) {
            if (i3 == 1) {
                this.f.remove(i);
                return;
            } else {
                this.f.put(i, new DefaultTrackSelector.SelectionOverride(i, d(iArr, i2)));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (zI) {
            this.f.put(i, new DefaultTrackSelector.SelectionOverride(i, c(iArr, i2)));
        } else {
            this.f.put(i, new DefaultTrackSelector.SelectionOverride(i, i2));
        }
    }

    @RequiresNonNull({"mappedTrackInfo"})
    private boolean i(int groupIndex) {
        return this.g && this.m.get(groupIndex).length > 1 && this.k.getAdaptiveSupport(this.l, groupIndex, false) != 0;
    }

    private boolean j() {
        return this.h && this.m.length > 1;
    }

    private void k() {
        this.c.setChecked(this.n);
        this.d.setChecked(!this.n && this.f.size() == 0);
        for (int i = 0; i < this.j.length; i++) {
            DefaultTrackSelector.SelectionOverride selectionOverride = this.f.get(i);
            int i2 = 0;
            while (true) {
                CheckedTextView[][] checkedTextViewArr = this.j;
                if (i2 < checkedTextViewArr[i].length) {
                    if (selectionOverride != null) {
                        this.j[i][i2].setChecked(selectionOverride.containsTrack(((c) Assertions.checkNotNull(checkedTextViewArr[i][i2].getTag())).b));
                    } else {
                        checkedTextViewArr[i][i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    private void l() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.k == null) {
            this.c.setEnabled(false);
            this.d.setEnabled(false);
            return;
        }
        this.c.setEnabled(true);
        this.d.setEnabled(true);
        TrackGroupArray trackGroups = this.k.getTrackGroups(this.l);
        this.m = trackGroups;
        this.j = new CheckedTextView[trackGroups.length][];
        boolean zJ = j();
        int i = 0;
        while (true) {
            TrackGroupArray trackGroupArray = this.m;
            if (i >= trackGroupArray.length) {
                k();
                return;
            }
            TrackGroup trackGroup = trackGroupArray.get(i);
            boolean zI = i(i);
            CheckedTextView[][] checkedTextViewArr = this.j;
            int i2 = trackGroup.length;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            c[] cVarArr = new c[i2];
            for (int i3 = 0; i3 < trackGroup.length; i3++) {
                cVarArr[i3] = new c(i, i3, trackGroup.getFormat(i3));
            }
            Comparator<c> comparator = this.o;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                if (i4 == 0) {
                    addView(this.b.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.b.inflate((zI || zJ) ? android.R.layout.simple_list_item_multiple_choice : android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.a);
                checkedTextView.setText(this.i.getTrackName(cVarArr[i4].c));
                checkedTextView.setTag(cVarArr[i4]);
                if (this.k.getTrackSupport(this.l, i, i4) == 4) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.j[i][i4] = checkedTextView;
                addView(checkedTextView);
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClick(View view) {
        if (view == this.c) {
            g();
        } else if (view == this.d) {
            f();
        } else {
            h(view);
        }
        k();
        TrackSelectionListener trackSelectionListener = this.p;
        if (trackSelectionListener != null) {
            trackSelectionListener.onTrackSelectionChanged(getIsDisabled(), getOverrides());
        }
    }

    public boolean getIsDisabled() {
        return this.n;
    }

    public List<DefaultTrackSelector.SelectionOverride> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f.size());
        for (int i = 0; i < this.f.size(); i++) {
            arrayList.add(this.f.valueAt(i));
        }
        return arrayList;
    }

    public void init(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int rendererIndex, boolean isDisabled, List<DefaultTrackSelector.SelectionOverride> overrides, @Nullable final Comparator<Format> trackFormatComparator, @Nullable TrackSelectionListener listener) {
        this.k = mappedTrackInfo;
        this.l = rendererIndex;
        this.n = isDisabled;
        this.o = trackFormatComparator == null ? null : new Comparator() { // from class: com.google.android.exoplayer2.ui.d0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return TrackSelectionView.e(trackFormatComparator, (TrackSelectionView.c) obj, (TrackSelectionView.c) obj2);
            }
        };
        this.p = listener;
        int size = this.h ? overrides.size() : Math.min(overrides.size(), 1);
        for (int i = 0; i < size; i++) {
            DefaultTrackSelector.SelectionOverride selectionOverride = overrides.get(i);
            this.f.put(selectionOverride.groupIndex, selectionOverride);
        }
        l();
    }

    public void setAllowAdaptiveSelections(boolean allowAdaptiveSelections) {
        if (this.g != allowAdaptiveSelections) {
            this.g = allowAdaptiveSelections;
            l();
        }
    }

    public void setAllowMultipleOverrides(boolean allowMultipleOverrides) {
        if (this.h != allowMultipleOverrides) {
            this.h = allowMultipleOverrides;
            if (!allowMultipleOverrides && this.f.size() > 1) {
                for (int size = this.f.size() - 1; size > 0; size--) {
                    this.f.remove(size);
                }
            }
            l();
        }
    }

    public void setShowDisableOption(boolean showDisableOption) {
        this.c.setVisibility(showDisableOption ? 0 : 8);
    }

    public void setTrackNameProvider(TrackNameProvider trackNameProvider) {
        this.i = (TrackNameProvider) Assertions.checkNotNull(trackNameProvider);
        l();
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOrientation(1);
        this.f = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.b = layoutInflaterFrom;
        b bVar = new b();
        this.e = bVar;
        this.i = new DefaultTrackNameProvider(getResources());
        this.m = TrackGroupArray.EMPTY;
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}
