package com.xiaomi.hm.health.databases.converter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.converter.PropertyConverter;

/* JADX INFO: loaded from: classes20.dex */
public class ListStringConverter implements PropertyConverter<List<String>, String> {
    @Override // org.greenrobot.greendao.converter.PropertyConverter
    public String convertToDatabaseValue(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            sb.append(",");
        }
        return sb.toString();
    }

    @Override // org.greenrobot.greendao.converter.PropertyConverter
    public List<String> convertToEntityProperty(String str) {
        if (str == null) {
            return null;
        }
        return Arrays.asList(str.split(","));
    }
}
