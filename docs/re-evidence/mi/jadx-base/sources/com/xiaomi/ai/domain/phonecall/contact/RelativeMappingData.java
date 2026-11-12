package com.xiaomi.ai.domain.phonecall.contact;

import com.xiaomi.ai.api.Phone;
import com.xiaomi.ai.domain.phonecall.common.NameType;
import com.xiaomi.ai.domain.phonecall.common.SlotRet;
import com.xiaomi.ai.domain.phonecall.util.NameNormaliztion;
import defpackage.aqe;
import defpackage.qpe;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class RelativeMappingData {
    private static final qpe LOGGER = aqe.f(RelativeMappingData.class);
    private Map<String, RelativeMappingEntry> relativeContactNameMapping = new HashMap();
    private boolean updated = false;

    public static class RelativeMappingEntry {
        private boolean isValid;
        private String name;
        private String userId;

        public RelativeMappingEntry(String str, String str2, boolean z) {
            this.userId = str;
            this.name = str2;
            this.isValid = z;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof RelativeMappingEntry)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            return getName().equals(((RelativeMappingEntry) obj).getName());
        }

        public String getName() {
            return this.name;
        }

        public String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return getName().hashCode();
        }

        public boolean isValid() {
            return this.isValid;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setUserId(String str) {
            this.userId = str;
        }

        public void setValid(boolean z) {
            this.isValid = z;
        }
    }

    public static boolean hasRelativeNameSlot(List<Phone.NameSlot> list) {
        if (list != null && list.size() != 0) {
            Iterator<Phone.NameSlot> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getNameType().equals(Phone.NameType.RELATIVE)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasRelativeSlot(List<SlotRet> list) {
        if (list != null && list.size() != 0) {
            Iterator<SlotRet> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getNameType().equals(NameType.RELATIVE)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void clear() {
        this.relativeContactNameMapping.clear();
        this.updated = true;
    }

    public Map<String, RelativeMappingEntry> getRelativeNameContactMapping() {
        return this.relativeContactNameMapping;
    }

    public boolean isUpdated() {
        return this.updated;
    }

    public void load(String str) {
        if (str == null) {
            LOGGER.info("load relativeMappingData path is null");
            return;
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                String[] strArrSplit = line.split("@@@");
                if (strArrSplit.length == 3) {
                    this.relativeContactNameMapping.put(strArrSplit[0], new RelativeMappingEntry(strArrSplit[1], strArrSplit[2], true));
                }
            }
        } catch (IOException unused) {
            LOGGER.info("load relativeMappingData: FAIL: " + str);
        }
    }

    public List<SlotRet> mapRelativeSlots(List<SlotRet> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        for (SlotRet slotRet : list) {
            if (slotRet.getNameType().equals(NameType.RELATIVE)) {
                Set<String> relativeSynonyms = NameNormaliztion.getInstance().getRelativeSynonyms(slotRet.getSlot());
                if (relativeSynonyms == null) {
                    relativeSynonyms = new HashSet<>();
                }
                relativeSynonyms.add(slotRet.getSlot());
                Iterator<String> it = relativeSynonyms.iterator();
                while (it.hasNext()) {
                    RelativeMappingEntry relativeMappingEntry = this.relativeContactNameMapping.get(it.next());
                    if (relativeMappingEntry != null) {
                        SlotRet slotRet2 = new SlotRet(relativeMappingEntry.getName(), slotRet.getPrefix(), slotRet.getSuffix(), Boolean.FALSE);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(slotRet2);
                        return arrayList;
                    }
                }
            }
        }
        return null;
    }

    public void pushRelativeMapping(String str, RelativeMappingEntry relativeMappingEntry) {
        Iterator<String> it = this.relativeContactNameMapping.keySet().iterator();
        while (it.hasNext()) {
            if (this.relativeContactNameMapping.get(it.next()).equals(relativeMappingEntry)) {
                it.remove();
            }
        }
        this.relativeContactNameMapping.put(str, relativeMappingEntry);
    }

    public void setUpdated(boolean z) {
        this.updated = z;
    }

    public void write(String str) {
        if (str == null) {
            LOGGER.info("write relativeMappingData path is null");
            return;
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            for (Map.Entry<String, RelativeMappingEntry> entry : this.relativeContactNameMapping.entrySet()) {
                bufferedWriter.write(entry.getKey() + "@@@" + entry.getValue().getUserId() + "@@@" + entry.getValue().getName() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException unused) {
            LOGGER.info("serialize relativeMapping: FAIL: " + str);
        }
    }
}
