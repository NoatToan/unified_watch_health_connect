package com.huawei.uikit.hwalphaindexerlistview.widget;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import defpackage.xdo;
import defpackage.xdq;
import java.text.CollationKey;
import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class HwSortedTextListAdapter extends BaseAdapter {
    private static final String l = "HwSortedTextListAdapter";
    private static final int m = 16;
    private static final String n = "";
    private static final int o = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwSectionIndexer f29254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29256c;
    private final Object d;
    private boolean e;
    private Map<String, String> f;
    private Map<String, CollationKey> g;
    private Context h;
    private String i;
    private LayoutInflater j;
    private List<? extends Map<String, ?>> k;

    class b implements Comparator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collator f29257a;

        b(Collator collator) {
            this.f29257a = collator;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            int iA;
            if ("".equals(str)) {
                return 1;
            }
            if ("".equals(str2)) {
                return -1;
            }
            if (HwSortedTextListAdapter.this.e) {
                if ("#".equals(str)) {
                    return 1;
                }
                if ("#".equals(str2)) {
                    return -1;
                }
            }
            return (!MLAsrConstants.LAN_ZH.equals(Locale.getDefault().getLanguage()) || (iA = HwSortedTextListAdapter.this.a(str, str2)) == 0) ? this.f29257a.compare(str, str2) : iA;
        }
    }

    class c implements Comparator<Map<String, ?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f29259a;

        c(Comparator comparator) {
            this.f29259a = comparator;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map<String, ?> map, Map<String, ?> map2) {
            int iA;
            String string = map.get(HwSortedTextListAdapter.this.i).toString();
            String string2 = map2.get(HwSortedTextListAdapter.this.i).toString();
            String str = (String) HwSortedTextListAdapter.this.f.get(string);
            String str2 = (String) HwSortedTextListAdapter.this.f.get(string2);
            if (this.f29259a == null) {
                return 0;
            }
            if ("".equals(str) && "".equals(str2)) {
                return this.f29259a.compare(string, string2);
            }
            if ("".equals(str) && !"".equals(str2)) {
                return 1;
            }
            if ("".equals(str2) && !"".equals(str)) {
                return -1;
            }
            if (HwSortedTextListAdapter.this.e && !str.equals(str2)) {
                if ("#".equals(str)) {
                    return 1;
                }
                if ("#".equals(str2)) {
                    return -1;
                }
            }
            if (MLAsrConstants.LAN_ZH.equals(Locale.getDefault().getLanguage()) && (iA = HwSortedTextListAdapter.this.a(str, str2)) != 0) {
                return iA;
            }
            int iCompare = this.f29259a.compare(str, str2);
            return iCompare == 0 ? this.f29259a.compare(string, string2) : iCompare;
        }
    }

    public HwSortedTextListAdapter(Context context, int i, List<? extends Map<String, ?>> list, String str) {
        this(context, i, 0, list, str);
    }

    public Context getContext() {
        return this.h;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.k.size();
    }

    public LayoutInflater getInflater() {
        return this.j;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return (this.k != null && i >= 0 && i < getCount()) ? this.k.get(i).get(this.i) : "";
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public int getPosition(Map<String, ?> map) {
        return this.k.indexOf(map);
    }

    public int getPositionForSection(int i) {
        return this.f29254a.getPositionForSection(i);
    }

    public int getSectionForPosition(int i) {
        return this.f29254a.getSectionForPosition(i);
    }

    public Object getSectionNameForPosition(int i) {
        return this.f29254a.getSections()[getSectionForPosition(i)];
    }

    public Object[] getSections() {
        return this.f29254a.getSections();
    }

    public String getSortKeyName() {
        return this.i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, this.f29255b);
    }

    public boolean isDigitLast() {
        return this.e;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    public void setSortKeyName(String str) {
        this.i = str;
    }

    public void setViewImage(ImageView imageView, String str) {
        if (imageView == null) {
            Log.w(l, "setViewImage: view is null!");
            return;
        }
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void setViewText(TextView textView, String str) {
        if (textView == null) {
            Log.w(l, "setViewText: view is null!");
        } else {
            textView.setText(str);
        }
    }

    public void sort(Comparator<Object> comparator) {
        synchronized (this.d) {
            Collections.sort(this.k, new c(comparator));
        }
        notifyDataSetChanged();
    }

    public HwSortedTextListAdapter(Context context, int i, int i2, List<? extends Map<String, ?>> list, String str) {
        this(context, i, i2, list, str, false);
    }

    public HwSortedTextListAdapter(Context context, int i, int i2, List<? extends Map<String, ?>> list, String str, boolean z) {
        this.f29256c = 0;
        this.d = new Object();
        this.e = false;
        this.h = context;
        this.j = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f29255b = i;
        this.f29256c = i2;
        this.e = z;
        this.k = list;
        this.i = str;
        a();
    }

    private View a(int i, View view, ViewGroup viewGroup, int i2) {
        TextView textView;
        if (view == null) {
            view = this.j.inflate(i2, viewGroup, false);
        }
        try {
            int i3 = this.f29256c;
            if (i3 == 0) {
                textView = view instanceof TextView ? (TextView) view : null;
            } else {
                textView = (TextView) view.findViewById(i3);
            }
            Object item = getItem(i);
            if (textView != null) {
                if (item instanceof CharSequence) {
                    textView.setText((CharSequence) item);
                    return view;
                }
                textView.setText(String.valueOf(item));
            }
            return view;
        } catch (ClassCastException unused) {
            throw new IllegalStateException("HwSortedTextListAdapter requires the resource ID to be a TextView");
        }
    }

    public void setViewImage(ImageView imageView, int i) {
        if (imageView == null) {
            Log.w(l, "setViewImage: view is null!");
        } else {
            imageView.setImageResource(i);
        }
    }

    private void a() {
        xdo xdoVarD = xdo.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        this.f = new HashMap(16);
        this.g = new HashMap(16);
        Collator collator = Collator.getInstance();
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            String string = this.k.get(i).get(this.i).toString();
            this.g.put(string, collator.getCollationKey(string));
            String strB = TextUtils.isEmpty(string) ? "" : xdoVarD.b(string);
            this.f.put(string, strB);
            if (linkedHashMap.containsKey(strB)) {
                linkedHashMap.put(strB, Integer.valueOf(((Integer) linkedHashMap.get(strB)).intValue() + 1));
            } else {
                linkedHashMap.put(strB, 1);
            }
        }
        String[] strArr = (String[]) linkedHashMap.keySet().toArray(new String[0]);
        int length = strArr.length;
        a(strArr, collator);
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = ((Integer) linkedHashMap.get(strArr[i2])).intValue();
        }
        this.f29254a = new HwSectionIndexer(strArr, iArr);
        sort(collator);
    }

    private void a(String[] strArr, Collator collator) {
        Arrays.sort(strArr, new b(collator));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(String str, String str2) {
        if (str == null || str2 == null) {
            return 0;
        }
        int length = str.length();
        int length2 = str2.length();
        if (length > length2) {
            return 1;
        }
        return length < length2 ? -1 : 0;
    }

    private String a(String str) {
        String strA = xdq.c().a(str);
        return (!TextUtils.isEmpty(strA) && strA.length() >= 1) ? strA.substring(0, 1).toUpperCase(Locale.ENGLISH) : "";
    }
}
