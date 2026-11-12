package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.maps.MapboxMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class q0 extends q7.c implements View.OnClickListener {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SearchView f5213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SearchableInfo f5214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f5215n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f5216o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f5217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ColorStateList f5219r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5220t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5221v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5222w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5223x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5224y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f5225z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f5226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f5227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f5228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f5229d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f5230e;

        public a(View view2) {
            this.f5226a = (TextView) view2.findViewById(R.id.text1);
            this.f5227b = (TextView) view2.findViewById(R.id.text2);
            this.f5228c = (ImageView) view2.findViewById(R.id.icon1);
            this.f5229d = (ImageView) view2.findViewById(R.id.icon2);
            this.f5230e = (ImageView) view2.findViewById(com.garmin.android.apps.connectmobile.R.id.edit_query);
        }
    }

    public q0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f5218q = 1;
        this.f5220t = -1;
        this.f5221v = -1;
        this.f5222w = -1;
        this.f5223x = -1;
        this.f5224y = -1;
        this.f5225z = -1;
        this.f5213l = searchView;
        this.f5214m = searchableInfo;
        this.f5217p = searchView.getSuggestionCommitIconResId();
        this.f5215n = context;
        this.f5216o = weakHashMap;
    }

    public static String k(Cursor cursor, int i14) {
        if (i14 == -1) {
            return null;
        }
        try {
            return cursor.getString(i14);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // q7.a, q7.b.a
    public final void a(Cursor cursor) {
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f5220t = cursor.getColumnIndex("suggest_text_1");
                this.f5221v = cursor.getColumnIndex("suggest_text_2");
                this.f5222w = cursor.getColumnIndex("suggest_text_2_url");
                this.f5223x = cursor.getColumnIndex("suggest_icon_1");
                this.f5224y = cursor.getColumnIndex("suggest_icon_2");
                this.f5225z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // q7.a, q7.b.a
    public final Cursor c(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        SearchView searchView = this.f5213l;
        if (searchView.getVisibility() != 0 || searchView.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor cursorJ = j(this.f5214m, string);
            if (cursorJ == null) {
                return null;
            }
            cursorJ.getCount();
            return cursorJ;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // q7.a, q7.b.a
    public final String convertToString(Cursor cursor) {
        String strK;
        String strK2;
        if (cursor == null) {
            return null;
        }
        String strK3 = k(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strK3 != null) {
            return strK3;
        }
        SearchableInfo searchableInfo = this.f5214m;
        if (searchableInfo.shouldRewriteQueryFromData() && (strK2 = k(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strK2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strK = k(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strK;
    }

    @Override // q7.a
    public final void d(View view2, Cursor cursor) {
        int i14;
        Drawable drawableI;
        CharSequence charSequenceK;
        a aVar = (a) view2.getTag();
        int i15 = this.f5225z;
        int i16 = i15 != -1 ? cursor.getInt(i15) : 0;
        TextView textView = aVar.f5226a;
        TextView textView2 = aVar.f5227b;
        ImageView imageView = aVar.f5230e;
        if (textView != null) {
            String strK = k(cursor, this.f5220t);
            textView.setText(strK);
            if (TextUtils.isEmpty(strK)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f5215n;
        if (textView2 != null) {
            String strK2 = k(cursor, this.f5222w);
            if (strK2 != null) {
                if (this.f5219r == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(com.garmin.android.apps.connectmobile.R.attr.textColorSearchUrl, typedValue, true);
                    this.f5219r = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strK2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f5219r, null), 0, strK2.length(), 33);
                charSequenceK = spannableString;
            } else {
                charSequenceK = k(cursor, this.f5221v);
            }
            if (TextUtils.isEmpty(charSequenceK)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceK);
            if (TextUtils.isEmpty(charSequenceK)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = aVar.f5228c;
        if (imageView2 != null) {
            int i17 = this.f5223x;
            if (i17 == -1) {
                drawableI = null;
            } else {
                drawableI = i(cursor.getString(i17));
                if (drawableI == null) {
                    ComponentName searchActivity = this.f5214m.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.f5216o;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = weakHashMap.get(strFlattenToShortString);
                        drawableI = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    searchActivity.flattenToShortString();
                                    drawableI = null;
                                } else {
                                    drawableI = drawable;
                                }
                            } else {
                                drawableI = null;
                            }
                        } catch (PackageManager.NameNotFoundException e4) {
                            e4.toString();
                        }
                        weakHashMap.put(strFlattenToShortString, drawableI == null ? null : drawableI.getConstantState());
                    }
                    if (drawableI == null) {
                        drawableI = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(drawableI);
            if (drawableI == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                drawableI.setVisible(false, false);
                drawableI.setVisible(true, false);
            }
        }
        ImageView imageView3 = aVar.f5229d;
        if (imageView3 == null) {
            i14 = 1;
        } else {
            int i18 = this.f5224y;
            Drawable drawableI2 = i18 == -1 ? null : i(cursor.getString(i18));
            imageView3.setImageDrawable(drawableI2);
            if (drawableI2 == null) {
                imageView3.setVisibility(8);
                i14 = 1;
            } else {
                imageView3.setVisibility(0);
                drawableI2.setVisible(false, false);
                i14 = 1;
                drawableI2.setVisible(true, false);
            }
        }
        int i19 = this.f5218q;
        if (i19 != 2 && (i19 != i14 || (i16 & 1) == 0)) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // q7.c, q7.a
    public final View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewG = super.g(context, cursor, viewGroup);
        viewG.setTag(new a(viewG));
        ((ImageView) viewG.findViewById(com.garmin.android.apps.connectmobile.R.id.edit_query)).setImageResource(this.f5217p);
        return viewG;
    }

    @Override // q7.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i14, View view2, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i14, view2, viewGroup);
        } catch (RuntimeException e4) {
            View viewF = f(this.f5215n, this.f143203c, viewGroup);
            if (viewF != null) {
                ((a) viewF.getTag()).f5226a.setText(e4.toString());
            }
            return viewF;
        }
    }

    @Override // q7.a, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        try {
            return super.getView(i14, view2, viewGroup);
        } catch (RuntimeException e4) {
            View viewG = g(this.f5215n, this.f143203c, viewGroup);
            ((a) viewG.getTag()).f5226a.setText(e4.toString());
            return viewG;
        }
    }

    public final Drawable h(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(am.j.j(uri, "No authority: "));
        }
        try {
            Resources resourcesForApplication = this.f5215n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(am.j.j(uri, "No path: "));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(am.j.j(uri, "Single path segment is not a resource ID: "));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(am.j.j(uri, "More than two path segments: "));
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException(am.j.j(uri, "No resource found for: "));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(am.j.j(uri, "No package found for authority: "));
        }
    }

    public final Drawable i(String str) {
        WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.f5216o;
        Context context = this.f5215n;
        Drawable drawableH = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i14 = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i14;
                Drawable.ConstantState constantState = weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawable = a7.b.getDrawable(context, i14);
                if (drawable != null) {
                    weakHashMap.put(str2, drawable.getConstantState());
                }
                return drawable;
            } catch (Resources.NotFoundException unused) {
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableH = h(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException unused4) {
                                uri.toString();
                            }
                            drawableH = drawableCreateFromStream;
                        } catch (Throwable th3) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException unused5) {
                                uri.toString();
                            }
                            throw th3;
                        }
                    }
                } catch (FileNotFoundException e4) {
                    Objects.toString(uri);
                    e4.getMessage();
                }
                if (drawableH != null) {
                    weakHashMap.put(str, drawableH.getConstantState());
                }
            }
        }
        return drawableH;
    }

    public final Cursor j(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter(MapboxMap.QFE_LIMIT, String.valueOf(50));
        return this.f5215n.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f143203c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f143203c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        Object tag = view2.getTag();
        if (tag instanceof CharSequence) {
            this.f5213l.h((CharSequence) tag);
        }
    }
}
