package javazoom.jl.converter;

import java.io.OutputStream;
import java.io.PrintWriter;
import javazoom.jl.decoder.JavaLayerException;

/* JADX INFO: loaded from: classes22.dex */
public class jlc {

    public static class a {
        public int b;
        public String e;
        public String f;
        public int h = 3;
        public int a = 0;
        public boolean c = false;
        public float d = 32768.0f;
        public boolean g = false;

        public boolean a() {
            System.out.println("JavaLayer Converter :");
            System.out.println("  -v[x]         verbose mode. ");
            System.out.println("                default = 2");
            System.out.println("  -p name    output as a PCM wave file");
            System.out.println("");
            System.out.println("  More info on http://www.javazoom.net");
            return false;
        }

        public boolean b(String[] strArr) {
            this.f = null;
            int length = strArr.length;
            this.g = false;
            this.b = 0;
            this.e = "";
            if (length < 2 || strArr[1].equals("-h")) {
                return a();
            }
            int i = 1;
            while (i < length) {
                if (strArr[i].charAt(0) != '-') {
                    this.f = strArr[i];
                    System.out.println("FileName = " + strArr[i]);
                    if (this.f == null) {
                        return a();
                    }
                } else if (strArr[i].startsWith("-v")) {
                    this.g = true;
                    if (strArr[i].length() > 2) {
                        try {
                            this.h = Integer.parseInt(strArr[i].substring(2));
                        } catch (NumberFormatException unused) {
                            System.err.println("Invalid verbose level. Using default.");
                        }
                    }
                    System.out.println("Verbose Activated (level " + this.h + ")");
                } else {
                    if (!strArr[i].equals("-p")) {
                        return a();
                    }
                    i++;
                    if (i == length) {
                        System.out.println("Please specify an output filename after the -p option!");
                        System.exit(1);
                    }
                    this.e = strArr[i];
                }
                i++;
            }
            if (this.f == null) {
                return a();
            }
            return true;
        }
    }

    public static void main(String[] strArr) {
        System.currentTimeMillis();
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = "jlc";
        int i = 0;
        while (i < strArr.length) {
            int i2 = i + 1;
            strArr2[i2] = strArr[i];
            i = i2;
        }
        a aVar = new a();
        if (!aVar.b(strArr2)) {
            System.exit(1);
        }
        try {
            new Converter().convert(aVar.f, aVar.e, new Converter.PrintWriterProgressListener(new PrintWriter((OutputStream) System.out, true), aVar.g ? aVar.h : 0));
        } catch (JavaLayerException e) {
            System.err.println("Convertion failure: " + e);
        }
        System.exit(0);
    }
}
