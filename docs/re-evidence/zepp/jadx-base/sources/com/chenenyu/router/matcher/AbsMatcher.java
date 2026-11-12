package com.chenenyu.router.matcher;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.chenenyu.router.RouteRequest;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbsMatcher implements a {
    private int a;

    public AbsMatcher(int i) {
        this.a = i;
    }

    @Override // com.chenenyu.router.matcher.a
    public abstract /* synthetic */ Object generate(Context context, Uri uri, @Nullable Class<?> cls);

    public boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    @Override // com.chenenyu.router.matcher.a
    public abstract /* synthetic */ boolean match(Context context, Uri uri, @Nullable String str, RouteRequest routeRequest);

    public void parseParams(Uri uri, RouteRequest routeRequest) {
        if (uri.getQuery() != null) {
            Bundle extras = routeRequest.getExtras();
            if (extras == null) {
                extras = new Bundle();
                routeRequest.setExtras(extras);
            }
            for (String str : uri.getQueryParameterNames()) {
                List<String> queryParameters = uri.getQueryParameters(str);
                if (queryParameters.size() > 1) {
                    extras.putStringArray(str, (String[]) queryParameters.toArray(new String[0]));
                } else if (queryParameters.size() == 1) {
                    extras.putString(str, queryParameters.get(0));
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull a aVar) {
        if (this == aVar) {
            return 0;
        }
        if (aVar instanceof AbsMatcher) {
            return this.a > ((AbsMatcher) aVar).a ? -1 : 1;
        }
        return aVar.compareTo(this);
    }
}
