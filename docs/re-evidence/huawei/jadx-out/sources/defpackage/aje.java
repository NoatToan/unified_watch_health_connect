package defpackage;

import com.github.promeg.pinyinhelper.PinyinDict;
import com.github.promeg.pinyinhelper.SegmentationSelector;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class aje {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final b f474c = new b();

    static String a(String str, zup zupVar, List<PinyinDict> list, String str2, SegmentationSelector segmentationSelector) {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (zupVar == null || segmentationSelector == null) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                stringBuffer.append(aji.d(str.charAt(i)));
                if (i != str.length() - 1) {
                    stringBuffer.append(str2);
                }
            }
            return stringBuffer.toString();
        }
        List<zul> listSelect = segmentationSelector.select(zupVar.a(str));
        Collections.sort(listSelect, f474c);
        StringBuffer stringBuffer2 = new StringBuffer();
        int size = 0;
        int i2 = 0;
        while (size < str.length()) {
            if (i2 < listSelect.size() && size == listSelect.get(i2).getStart()) {
                String[] strArrE = e(listSelect.get(i2).c(), list);
                for (int i3 = 0; i3 < strArrE.length; i3++) {
                    stringBuffer2.append(strArrE[i3].toUpperCase());
                    if (i3 != strArrE.length - 1) {
                        stringBuffer2.append(str2);
                    }
                }
                size += listSelect.get(i2).size();
                i2++;
            } else {
                stringBuffer2.append(aji.d(str.charAt(size)));
                size++;
            }
            if (size != str.length()) {
                stringBuffer2.append(str2);
            }
        }
        return stringBuffer2.toString();
    }

    static String[] e(String str, List<PinyinDict> list) {
        if (list != null) {
            for (PinyinDict pinyinDict : list) {
                if (pinyinDict != null && pinyinDict.words() != null && pinyinDict.words().contains(str)) {
                    return pinyinDict.toPinyin(str);
                }
            }
        }
        throw new IllegalArgumentException("No pinyin dict contains word: " + str);
    }

    static final class b implements Comparator<zul> {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(zul zulVar, zul zulVar2) {
            if (zulVar.getStart() == zulVar2.getStart()) {
                if (zulVar.size() < zulVar2.size()) {
                    return 1;
                }
                return zulVar.size() == zulVar2.size() ? 0 : -1;
            }
            if (zulVar.getStart() < zulVar2.getStart()) {
                return -1;
            }
            return zulVar.getStart() == zulVar2.getStart() ? 0 : 1;
        }
    }
}
