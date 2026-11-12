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

/* JADX INFO: loaded from: classes14.dex */
public class TrackSelectionView extends LinearLayout {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final ComponentListener componentListener;
    private final CheckedTextView defaultView;
    private final CheckedTextView disableView;
    private final LayoutInflater inflater;
    private boolean isDisabled;
    private TrackSelectionListener listener;
    private MappingTrackSelector.MappedTrackInfo mappedTrackInfo;
    private final SparseArray<DefaultTrackSelector.SelectionOverride> overrides;
    private int rendererIndex;
    private final int selectableItemBackgroundResourceId;
    private TrackGroupArray trackGroups;
    private Comparator<TrackInfo> trackInfoComparator;
    private TrackNameProvider trackNameProvider;
    private CheckedTextView[][] trackViews;

    public class ComponentListener implements View.OnClickListener {
        private ComponentListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view2) {
            TrackSelectionView.this.onClick(view2);
        }
    }

    public static final class TrackInfo {
        public final Format format;
        public final int groupIndex;
        public final int trackIndex;

        public TrackInfo(int i14, int i15, Format format) {
            this.groupIndex = i14;
            this.trackIndex = i15;
            this.format = format;
        }
    }

    public interface TrackSelectionListener {
        void onTrackSelectionChanged(boolean z14, List<DefaultTrackSelector.SelectionOverride> list);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        setOrientation(1);
        this.overrides = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.selectableItemBackgroundResourceId = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.inflater = layoutInflaterFrom;
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        this.trackNameProvider = new DefaultTrackNameProvider(getResources());
        this.trackGroups = TrackGroupArray.EMPTY;
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.disableView = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(componentListener);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.defaultView = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(componentListener);
        addView(checkedTextView2);
    }

    private static int[] getTracksAdding(int[] iArr, int i14) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArrCopyOf.length - 1] = i14;
        return iArrCopyOf;
    }

    private static int[] getTracksRemoving(int[] iArr, int i14) {
        int[] iArr2 = new int[iArr.length - 1];
        int i15 = 0;
        for (int i16 : iArr) {
            if (i16 != i14) {
                iArr2[i15] = i16;
                i15++;
            }
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$init$0(Comparator comparator, TrackInfo trackInfo, TrackInfo trackInfo2) {
        return comparator.compare(trackInfo.format, trackInfo2.format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClick(View view2) {
        if (view2 == this.disableView) {
            onDisableViewClicked();
        } else if (view2 == this.defaultView) {
            onDefaultViewClicked();
        } else {
            onTrackViewClicked(view2);
        }
        updateViewStates();
        TrackSelectionListener trackSelectionListener = this.listener;
        if (trackSelectionListener != null) {
            trackSelectionListener.onTrackSelectionChanged(getIsDisabled(), getOverrides());
        }
    }

    private void onDefaultViewClicked() {
        this.isDisabled = false;
        this.overrides.clear();
    }

    private void onDisableViewClicked() {
        this.isDisabled = true;
        this.overrides.clear();
    }

    private void onTrackViewClicked(View view2) {
        this.isDisabled = false;
        TrackInfo trackInfo = (TrackInfo) Assertions.checkNotNull(view2.getTag());
        int i14 = trackInfo.groupIndex;
        int i15 = trackInfo.trackIndex;
        DefaultTrackSelector.SelectionOverride selectionOverride = this.overrides.get(i14);
        Assertions.checkNotNull(this.mappedTrackInfo);
        if (selectionOverride == null) {
            if (!this.allowMultipleOverrides && this.overrides.size() > 0) {
                this.overrides.clear();
            }
            this.overrides.put(i14, new DefaultTrackSelector.SelectionOverride(i14, i15));
            return;
        }
        int i16 = selectionOverride.length;
        int[] iArr = selectionOverride.tracks;
        boolean zIsChecked = ((CheckedTextView) view2).isChecked();
        boolean zShouldEnableAdaptiveSelection = shouldEnableAdaptiveSelection(i14);
        boolean z14 = zShouldEnableAdaptiveSelection || shouldEnableMultiGroupSelection();
        if (zIsChecked && z14) {
            if (i16 == 1) {
                this.overrides.remove(i14);
                return;
            } else {
                this.overrides.put(i14, new DefaultTrackSelector.SelectionOverride(i14, getTracksRemoving(iArr, i15)));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (zShouldEnableAdaptiveSelection) {
            this.overrides.put(i14, new DefaultTrackSelector.SelectionOverride(i14, getTracksAdding(iArr, i15)));
        } else {
            this.overrides.put(i14, new DefaultTrackSelector.SelectionOverride(i14, i15));
        }
    }

    private boolean shouldEnableAdaptiveSelection(int i14) {
        return this.allowAdaptiveSelections && this.trackGroups.get(i14).length > 1 && this.mappedTrackInfo.getAdaptiveSupport(this.rendererIndex, i14, false) != 0;
    }

    private boolean shouldEnableMultiGroupSelection() {
        return this.allowMultipleOverrides && this.trackGroups.length > 1;
    }

    private void updateViewStates() {
        this.disableView.setChecked(this.isDisabled);
        this.defaultView.setChecked(!this.isDisabled && this.overrides.size() == 0);
        for (int i14 = 0; i14 < this.trackViews.length; i14++) {
            DefaultTrackSelector.SelectionOverride selectionOverride = this.overrides.get(i14);
            int i15 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.trackViews[i14];
                if (i15 < checkedTextViewArr.length) {
                    if (selectionOverride != null) {
                        this.trackViews[i14][i15].setChecked(selectionOverride.containsTrack(((TrackInfo) Assertions.checkNotNull(checkedTextViewArr[i15].getTag())).trackIndex));
                    } else {
                        checkedTextViewArr[i15].setChecked(false);
                    }
                    i15++;
                }
            }
        }
    }

    private void updateViews() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo = this.mappedTrackInfo;
        CheckedTextView checkedTextView = this.disableView;
        if (mappedTrackInfo == null) {
            checkedTextView.setEnabled(false);
            this.defaultView.setEnabled(false);
            return;
        }
        checkedTextView.setEnabled(true);
        this.defaultView.setEnabled(true);
        TrackGroupArray trackGroups = this.mappedTrackInfo.getTrackGroups(this.rendererIndex);
        this.trackGroups = trackGroups;
        this.trackViews = new CheckedTextView[trackGroups.length][];
        boolean zShouldEnableMultiGroupSelection = shouldEnableMultiGroupSelection();
        int i14 = 0;
        while (true) {
            TrackGroupArray trackGroupArray = this.trackGroups;
            if (i14 >= trackGroupArray.length) {
                updateViewStates();
                return;
            }
            TrackGroup trackGroup = trackGroupArray.get(i14);
            boolean zShouldEnableAdaptiveSelection = shouldEnableAdaptiveSelection(i14);
            CheckedTextView[][] checkedTextViewArr = this.trackViews;
            int i15 = trackGroup.length;
            checkedTextViewArr[i14] = new CheckedTextView[i15];
            TrackInfo[] trackInfoArr = new TrackInfo[i15];
            for (int i16 = 0; i16 < trackGroup.length; i16++) {
                trackInfoArr[i16] = new TrackInfo(i14, i16, trackGroup.getFormat(i16));
            }
            Comparator<TrackInfo> comparator = this.trackInfoComparator;
            if (comparator != null) {
                Arrays.sort(trackInfoArr, comparator);
            }
            for (int i17 = 0; i17 < i15; i17++) {
                if (i17 == 0) {
                    addView(this.inflater.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView2 = (CheckedTextView) this.inflater.inflate((zShouldEnableAdaptiveSelection || zShouldEnableMultiGroupSelection) ? android.R.layout.simple_list_item_multiple_choice : android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView2.setBackgroundResource(this.selectableItemBackgroundResourceId);
                checkedTextView2.setText(this.trackNameProvider.getTrackName(trackInfoArr[i17].format));
                checkedTextView2.setTag(trackInfoArr[i17]);
                if (this.mappedTrackInfo.getTrackSupport(this.rendererIndex, i14, i17) == 4) {
                    checkedTextView2.setFocusable(true);
                    checkedTextView2.setOnClickListener(this.componentListener);
                } else {
                    checkedTextView2.setFocusable(false);
                    checkedTextView2.setEnabled(false);
                }
                this.trackViews[i14][i17] = checkedTextView2;
                addView(checkedTextView2);
            }
            i14++;
        }
    }

    public boolean getIsDisabled() {
        return this.isDisabled;
    }

    public List<DefaultTrackSelector.SelectionOverride> getOverrides() {
        ArrayList arrayList = new ArrayList(this.overrides.size());
        for (int i14 = 0; i14 < this.overrides.size(); i14++) {
            arrayList.add(this.overrides.valueAt(i14));
        }
        return arrayList;
    }

    public void init(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int i14, boolean z14, List<DefaultTrackSelector.SelectionOverride> list, final Comparator<Format> comparator, TrackSelectionListener trackSelectionListener) {
        this.mappedTrackInfo = mappedTrackInfo;
        this.rendererIndex = i14;
        this.isDisabled = z14;
        this.trackInfoComparator = comparator == null ? null : new Comparator() { // from class: com.google.android.exoplayer2.ui.m
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return TrackSelectionView.lambda$init$0(comparator, (TrackSelectionView.TrackInfo) obj, (TrackSelectionView.TrackInfo) obj2);
            }
        };
        this.listener = trackSelectionListener;
        int size = this.allowMultipleOverrides ? list.size() : Math.min(list.size(), 1);
        for (int i15 = 0; i15 < size; i15++) {
            DefaultTrackSelector.SelectionOverride selectionOverride = list.get(i15);
            this.overrides.put(selectionOverride.groupIndex, selectionOverride);
        }
        updateViews();
    }

    public void setAllowAdaptiveSelections(boolean z14) {
        if (this.allowAdaptiveSelections != z14) {
            this.allowAdaptiveSelections = z14;
            updateViews();
        }
    }

    public void setAllowMultipleOverrides(boolean z14) {
        if (this.allowMultipleOverrides != z14) {
            this.allowMultipleOverrides = z14;
            if (!z14 && this.overrides.size() > 1) {
                for (int size = this.overrides.size() - 1; size > 0; size--) {
                    this.overrides.remove(size);
                }
            }
            updateViews();
        }
    }

    public void setShowDisableOption(boolean z14) {
        this.disableView.setVisibility(z14 ? 0 : 8);
    }

    public void setTrackNameProvider(TrackNameProvider trackNameProvider) {
        this.trackNameProvider = (TrackNameProvider) Assertions.checkNotNull(trackNameProvider);
        updateViews();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }
}
