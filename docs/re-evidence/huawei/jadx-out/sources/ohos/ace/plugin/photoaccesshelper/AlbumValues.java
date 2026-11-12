package ohos.ace.plugin.photoaccesshelper;

import android.content.ContentQueryMap;
import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes46.dex */
public class AlbumValues {
    private ContentQueryMap albumMap;
    private Iterator<Map.Entry<String, ContentValues>> mIterator;

    public AlbumValues(ContentQueryMap contentQueryMap) {
        this.albumMap = contentQueryMap;
        getFirstValue();
    }

    public List<String> getColumns() {
        ContentQueryMap contentQueryMap = this.albumMap;
        if (contentQueryMap == null) {
            return null;
        }
        Map<String, ContentValues> rows = contentQueryMap.getRows();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = rows.keySet().iterator();
        while (it.hasNext()) {
            ContentValues contentValues = rows.get(it.next());
            Set<String> setKeySet = contentValues.keySet();
            if (setKeySet != null && !setKeySet.isEmpty()) {
                arrayList.addAll(contentValues.keySet());
                break;
            }
        }
        return arrayList;
    }

    public ContentValues getFirstValue() {
        Iterator<Map.Entry<String, ContentValues>> it = this.albumMap.getRows().entrySet().iterator();
        this.mIterator = it;
        if (it == null || !it.hasNext()) {
            return null;
        }
        return this.mIterator.next().getValue();
    }

    public ContentValues getNextValue() {
        Iterator<Map.Entry<String, ContentValues>> it = this.mIterator;
        if (it == null || !it.hasNext()) {
            return null;
        }
        return this.mIterator.next().getValue();
    }

    public boolean IsAtLastRow() {
        Iterator<Map.Entry<String, ContentValues>> it = this.mIterator;
        if (it == null) {
            return true;
        }
        return !it.hasNext();
    }

    public ContentValues getLastValue() {
        Iterator<Map.Entry<String, ContentValues>> it = this.mIterator;
        if (it == null) {
            return null;
        }
        ContentValues firstValue = it.hasNext() ? null : getFirstValue();
        while (this.mIterator.hasNext()) {
            firstValue = this.mIterator.next().getValue();
        }
        return firstValue;
    }

    public ContentValues gotoRow(int i) {
        ContentQueryMap contentQueryMap = this.albumMap;
        if (contentQueryMap == null || contentQueryMap.getRows().size() <= i) {
            return null;
        }
        this.mIterator = this.albumMap.getRows().entrySet().iterator();
        while (i > 0) {
            this.mIterator.next();
            i--;
        }
        return this.mIterator.next().getValue();
    }

    public ContentValues move(int i) {
        if (this.mIterator == null) {
            getFirstValue();
            i--;
        }
        while (i > 0) {
            this.mIterator.next();
            i--;
        }
        return this.mIterator.next().getValue();
    }

    public byte[] getAsBoolean(ContentValues contentValues, String str) {
        if (contentValues == null) {
            return null;
        }
        return (byte[]) contentValues.getAsBoolean(str);
    }

    public int size() {
        ContentQueryMap contentQueryMap = this.albumMap;
        if (contentQueryMap == null || contentQueryMap.getRows() == null) {
            return 0;
        }
        return this.albumMap.getRows().size();
    }
}
