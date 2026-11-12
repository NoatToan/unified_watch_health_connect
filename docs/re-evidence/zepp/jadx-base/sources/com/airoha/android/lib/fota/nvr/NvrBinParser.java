package com.airoha.android.lib.fota.nvr;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class NvrBinParser {
    private static String c = "&";
    private static String d = "=";
    private FileReader a;
    private List<NvrDescriptor> b;

    public NvrBinParser(String str) {
        try {
            this.a = new FileReader(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.b = new ArrayList();
    }

    public List<NvrDescriptor> getListNvrDescriptor() {
        return this.b;
    }

    public void startParse() {
        BufferedReader bufferedReader = new BufferedReader(this.a);
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    this.a.close();
                    return;
                } else if (line.startsWith(c)) {
                    String[] strArrSplit = line.split(d);
                    this.b.add(new NvrDescriptor(strArrSplit[0].trim().substring(3), strArrSplit[1].trim()));
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
