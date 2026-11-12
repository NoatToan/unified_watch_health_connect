package ch.qos.logback.core.joran.spi;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class ElementSelector extends ElementPath {
    public ElementSelector() {
    }

    private boolean equalityCheck(String str, String str2) {
        return str.equalsIgnoreCase(str2);
    }

    @Override // ch.qos.logback.core.joran.spi.ElementPath
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ElementSelector)) {
            return false;
        }
        ElementSelector elementSelector = (ElementSelector) obj;
        if (elementSelector.size() != size()) {
            return false;
        }
        int size = size();
        for (int i14 = 0; i14 < size; i14++) {
            if (!equalityCheck(get(i14), elementSelector.get(i14))) {
                return false;
            }
        }
        return true;
    }

    public boolean fullPathMatch(ElementPath elementPath) {
        if (elementPath.size() != size()) {
            return false;
        }
        int size = size();
        for (int i14 = 0; i14 < size; i14++) {
            if (!equalityCheck(get(i14), elementPath.get(i14))) {
                return false;
            }
        }
        return true;
    }

    public int getPrefixMatchLength(ElementPath elementPath) {
        if (elementPath == null) {
            return 0;
        }
        int size = this.partList.size();
        int size2 = elementPath.partList.size();
        if (size == 0 || size2 == 0) {
            return 0;
        }
        if (size > size2) {
            size = size2;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < size && equalityCheck(this.partList.get(i15), elementPath.partList.get(i15)); i15++) {
            i14++;
        }
        return i14;
    }

    public int getTailMatchLength(ElementPath elementPath) {
        int i14 = 0;
        if (elementPath == null) {
            return 0;
        }
        int size = this.partList.size();
        int size2 = elementPath.partList.size();
        if (size != 0 && size2 != 0) {
            int i15 = size <= size2 ? size : size2;
            for (int i16 = 1; i16 <= i15 && equalityCheck(this.partList.get(size - i16), elementPath.partList.get(size2 - i16)); i16++) {
                i14++;
            }
        }
        return i14;
    }

    public int hashCode() {
        int size = size();
        int iHashCode = 0;
        for (int i14 = 0; i14 < size; i14++) {
            iHashCode ^= get(i14).toLowerCase(Locale.US).hashCode();
        }
        return iHashCode;
    }

    public boolean isContainedIn(ElementPath elementPath) {
        if (elementPath == null) {
            return false;
        }
        return elementPath.toStableString().contains(toStableString());
    }

    public ElementSelector(String str) {
        super(str);
    }

    public ElementSelector(List<String> list) {
        super(list);
    }
}
