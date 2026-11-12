package com.huami.moving.maps;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.huami.moving.maps.gaode.GaodeGPSSolution;
import com.huami.moving.maps.google.GoogleGPSSolution;

/* JADX INFO: loaded from: classes11.dex */
public class GPSSolutionFactory {
    public static IGPSSolution a(Context context, FragmentManager fragmentManager, View view, Bundle bundle, boolean z, IMapLoadedCallback iMapLoadedCallback) {
        return z ? new GaodeGPSSolution(context, view, bundle, iMapLoadedCallback) : new GoogleGPSSolution(context, fragmentManager, iMapLoadedCallback, true);
    }

    public static IGPSSolution createSolution(Context context, FragmentManager fragmentManager, Bundle bundle, boolean z, IMapLoadedCallback iMapLoadedCallback) {
        return z ? new GaodeGPSSolution(context, bundle, iMapLoadedCallback) : new GoogleGPSSolution(context, fragmentManager, iMapLoadedCallback, false);
    }

    public static IGPSSolution createSolution(Context context, FragmentManager fragmentManager, Bundle bundle, boolean z, boolean z2, IMapLoadedCallback iMapLoadedCallback) {
        if (z) {
            return new GaodeGPSSolution(context, bundle, iMapLoadedCallback, z2);
        }
        return new GoogleGPSSolution(context, fragmentManager, iMapLoadedCallback, false);
    }
}
