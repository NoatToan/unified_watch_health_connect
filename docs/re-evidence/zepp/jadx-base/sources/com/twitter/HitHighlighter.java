package com.twitter;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.text.StringCharacterIterator;
import java.util.List;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes18.dex */
public class HitHighlighter {
    public static final String DEFAULT_HIGHLIGHT_TAG = "em";
    public String highlightTag = "em";

    public String getHighlightTag() {
        return this.highlightTag;
    }

    public String highlight(String str, List<List<Integer>> list) {
        if (list == null || list.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(str);
        boolean z = false;
        boolean z2 = true;
        int i = 0;
        for (char cFirst = stringCharacterIterator.first(); cFirst != 65535; cFirst = stringCharacterIterator.next()) {
            for (List<Integer> list2 : list) {
                if (list2.get(0).intValue() == i) {
                    sb.append(tag(false));
                    z = true;
                } else if (list2.get(1).intValue() == i) {
                    sb.append(tag(true));
                    z = false;
                }
            }
            if (cFirst == '<') {
                z2 = false;
            } else if (cFirst == '>' && !z2) {
                z2 = true;
            }
            if (z2) {
                i++;
            }
            sb.append(cFirst);
        }
        if (z) {
            sb.append(tag(true));
        }
        return sb.toString();
    }

    public void setHighlightTag(String str) {
        this.highlightTag = str;
    }

    public String tag(boolean z) {
        StringBuilder sb = new StringBuilder(this.highlightTag.length() + 3);
        sb.append(SearchCriteria.LT);
        if (z) {
            sb.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        }
        sb.append(this.highlightTag);
        sb.append(SearchCriteria.GT);
        return sb.toString();
    }
}
