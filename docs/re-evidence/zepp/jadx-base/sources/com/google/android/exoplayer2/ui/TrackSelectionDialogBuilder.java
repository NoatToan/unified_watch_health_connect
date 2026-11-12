package com.google.android.exoplayer2.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertDialog;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionUtil;
import com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackSelectionDialogBuilder {
    private final Context a;

    @StyleRes
    private int b;
    private final CharSequence c;
    private final MappingTrackSelector.MappedTrackInfo d;
    private final int e;
    private final DialogCallback f;
    private boolean g;
    private boolean h;
    private boolean i;

    @Nullable
    private TrackNameProvider j;
    private boolean k;
    private List<DefaultTrackSelector.SelectionOverride> l;

    @Nullable
    private Comparator<Format> m;

    public interface DialogCallback {
        void onTracksSelected(boolean isDisabled, List<DefaultTrackSelector.SelectionOverride> overrides);
    }

    public TrackSelectionDialogBuilder(Context context, CharSequence title, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int rendererIndex, DialogCallback callback) {
        this.a = context;
        this.c = title;
        this.d = mappedTrackInfo;
        this.e = rendererIndex;
        this.f = callback;
        this.l = Collections.emptyList();
    }

    @Nullable
    private Dialog c() {
        try {
            Class cls = Integer.TYPE;
            Object objNewInstance = AlertDialog.Builder.class.getConstructor(Context.class, cls).newInstance(this.a, Integer.valueOf(this.b));
            View viewInflate = LayoutInflater.from((Context) AlertDialog.Builder.class.getMethod("getContext", new Class[0]).invoke(objNewInstance, new Object[0])).inflate(R.layout.exo_track_selection_dialog, (ViewGroup) null);
            DialogInterface.OnClickListener onClickListenerG = g(viewInflate);
            AlertDialog.Builder.class.getMethod(com.alipay.sdk.m.x.d.o, CharSequence.class).invoke(objNewInstance, this.c);
            AlertDialog.Builder.class.getMethod("setView", View.class).invoke(objNewInstance, viewInflate);
            AlertDialog.Builder.class.getMethod("setPositiveButton", cls, DialogInterface.OnClickListener.class).invoke(objNewInstance, Integer.valueOf(android.R.string.ok), onClickListenerG);
            AlertDialog.Builder.class.getMethod("setNegativeButton", cls, DialogInterface.OnClickListener.class).invoke(objNewInstance, Integer.valueOf(android.R.string.cancel), null);
            return (Dialog) AlertDialog.Builder.class.getMethod("create", new Class[0]).invoke(objNewInstance, new Object[0]);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    private Dialog d() {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this.a, this.b);
        View viewInflate = LayoutInflater.from(builder.getContext()).inflate(R.layout.exo_track_selection_dialog, (ViewGroup) null);
        return builder.setTitle(this.c).setView(viewInflate).setPositiveButton(android.R.string.ok, g(viewInflate)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(DefaultTrackSelector defaultTrackSelector, DefaultTrackSelector.Parameters parameters, int i, TrackGroupArray trackGroupArray, boolean z, List list) {
        defaultTrackSelector.setParameters(TrackSelectionUtil.updateParametersWithOverride(parameters, i, trackGroupArray, z, list.isEmpty() ? null : (DefaultTrackSelector.SelectionOverride) list.get(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(TrackSelectionView trackSelectionView, DialogInterface dialogInterface, int i) {
        this.f.onTracksSelected(trackSelectionView.getIsDisabled(), trackSelectionView.getOverrides());
    }

    private DialogInterface.OnClickListener g(View dialogView) {
        final TrackSelectionView trackSelectionView = (TrackSelectionView) dialogView.findViewById(R.id.exo_track_selection_view);
        trackSelectionView.setAllowMultipleOverrides(this.h);
        trackSelectionView.setAllowAdaptiveSelections(this.g);
        trackSelectionView.setShowDisableOption(this.i);
        TrackNameProvider trackNameProvider = this.j;
        if (trackNameProvider != null) {
            trackSelectionView.setTrackNameProvider(trackNameProvider);
        }
        trackSelectionView.init(this.d, this.e, this.k, this.l, this.m, null);
        return new DialogInterface.OnClickListener() { // from class: rr7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.f(trackSelectionView, dialogInterface, i);
            }
        };
    }

    public Dialog build() {
        Dialog dialogC = c();
        return dialogC == null ? d() : dialogC;
    }

    public TrackSelectionDialogBuilder setAllowAdaptiveSelections(boolean allowAdaptiveSelections) {
        this.g = allowAdaptiveSelections;
        return this;
    }

    public TrackSelectionDialogBuilder setAllowMultipleOverrides(boolean allowMultipleOverrides) {
        this.h = allowMultipleOverrides;
        return this;
    }

    public TrackSelectionDialogBuilder setIsDisabled(boolean isDisabled) {
        this.k = isDisabled;
        return this;
    }

    public TrackSelectionDialogBuilder setOverride(@Nullable DefaultTrackSelector.SelectionOverride override) {
        return setOverrides(override == null ? Collections.emptyList() : Collections.singletonList(override));
    }

    public TrackSelectionDialogBuilder setOverrides(List<DefaultTrackSelector.SelectionOverride> overrides) {
        this.l = overrides;
        return this;
    }

    public TrackSelectionDialogBuilder setShowDisableOption(boolean showDisableOption) {
        this.i = showDisableOption;
        return this;
    }

    public TrackSelectionDialogBuilder setTheme(@StyleRes int themeResId) {
        this.b = themeResId;
        return this;
    }

    public void setTrackFormatComparator(@Nullable Comparator<Format> trackFormatComparator) {
        this.m = trackFormatComparator;
    }

    public TrackSelectionDialogBuilder setTrackNameProvider(@Nullable TrackNameProvider trackNameProvider) {
        this.j = trackNameProvider;
        return this;
    }

    public TrackSelectionDialogBuilder(Context context, CharSequence title, final DefaultTrackSelector trackSelector, final int rendererIndex) {
        this.a = context;
        this.c = title;
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo = (MappingTrackSelector.MappedTrackInfo) Assertions.checkNotNull(trackSelector.getCurrentMappedTrackInfo());
        this.d = mappedTrackInfo;
        this.e = rendererIndex;
        final TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(rendererIndex);
        final DefaultTrackSelector.Parameters parameters = trackSelector.getParameters();
        this.k = parameters.getRendererDisabled(rendererIndex);
        DefaultTrackSelector.SelectionOverride selectionOverride = parameters.getSelectionOverride(rendererIndex, trackGroups);
        this.l = selectionOverride == null ? Collections.emptyList() : Collections.singletonList(selectionOverride);
        this.f = new DialogCallback() { // from class: sr7
            @Override // com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder.DialogCallback
            public final void onTracksSelected(boolean z, List list) {
                TrackSelectionDialogBuilder.e(trackSelector, parameters, rendererIndex, trackGroups, z, list);
            }
        };
    }
}
