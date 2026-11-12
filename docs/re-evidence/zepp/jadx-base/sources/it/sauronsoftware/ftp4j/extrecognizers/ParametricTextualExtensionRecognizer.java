package it.sauronsoftware.ftp4j.extrecognizers;

import it.sauronsoftware.ftp4j.FTPTextualExtensionRecognizer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes22.dex */
public class ParametricTextualExtensionRecognizer implements FTPTextualExtensionRecognizer {
    private ArrayList a = new ArrayList();

    public ParametricTextualExtensionRecognizer() {
    }

    public void addExtension(String str) {
        synchronized (this.a) {
            this.a.add(str.toLowerCase());
        }
    }

    public String[] getExtensions() {
        String[] strArr;
        synchronized (this.a) {
            int size = this.a.size();
            strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = (String) this.a.get(i);
            }
        }
        return strArr;
    }

    @Override // it.sauronsoftware.ftp4j.FTPTextualExtensionRecognizer
    public boolean isTextualExt(String str) {
        boolean zContains;
        synchronized (this.a) {
            zContains = this.a.contains(str);
        }
        return zContains;
    }

    public void removeExtension(String str) {
        synchronized (this.a) {
            this.a.remove(str.toLowerCase());
        }
    }

    public ParametricTextualExtensionRecognizer(String[] strArr) {
        for (String str : strArr) {
            addExtension(str);
        }
    }

    public ParametricTextualExtensionRecognizer(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof String) {
                addExtension((String) obj);
            }
        }
    }
}
