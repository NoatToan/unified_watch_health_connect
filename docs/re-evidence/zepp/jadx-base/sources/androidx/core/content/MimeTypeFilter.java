package androidx.core.content;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class MimeTypeFilter {
    private MimeTypeFilter() {
    }

    public static boolean matches(@Nullable String mimeType, @NonNull String filter) {
        if (mimeType == null) {
            return false;
        }
        return mimeTypeAgainstFilter(mimeType.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE), filter.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE));
    }

    @NonNull
    public static String[] matchesMany(@Nullable String[] mimeTypes, @NonNull String filter) {
        if (mimeTypes == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = filter.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        for (String str : mimeTypes) {
            if (mimeTypeAgainstFilter(str.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE), strArrSplit)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static boolean mimeTypeAgainstFilter(@NonNull String[] mimeTypeParts, @NonNull String[] filterParts) {
        if (filterParts.length != 2) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
        }
        if (filterParts[0].isEmpty() || filterParts[1].isEmpty()) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        }
        if (mimeTypeParts.length != 2) {
            return false;
        }
        if ("*".equals(filterParts[0]) || filterParts[0].equals(mimeTypeParts[0])) {
            return "*".equals(filterParts[1]) || filterParts[1].equals(mimeTypeParts[1]);
        }
        return false;
    }

    @Nullable
    public static String matches(@Nullable String mimeType, @NonNull String[] filters) {
        if (mimeType == null) {
            return null;
        }
        String[] strArrSplit = mimeType.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        for (String str : filters) {
            if (mimeTypeAgainstFilter(strArrSplit, str.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE))) {
                return str;
            }
        }
        return null;
    }

    @Nullable
    public static String matches(@Nullable String[] mimeTypes, @NonNull String filter) {
        if (mimeTypes == null) {
            return null;
        }
        String[] strArrSplit = filter.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        for (String str : mimeTypes) {
            if (mimeTypeAgainstFilter(str.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE), strArrSplit)) {
                return str;
            }
        }
        return null;
    }
}
