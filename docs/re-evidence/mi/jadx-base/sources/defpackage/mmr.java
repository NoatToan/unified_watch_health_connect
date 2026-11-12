package defpackage;

import com.xiaomi.ai.nlp.tokenizer.dict.SpecialWord;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class mmr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s27 f27010a = new s27();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f27011b = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f27012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27013b;

        public a(int i, int i2) {
            this.f27012a = i;
            this.f27013b = i2;
        }
    }

    public boolean a(InputStream inputStream, InputStream inputStream2) throws Throwable {
        this.f27010a.b(inputStream);
        inputStream.close();
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream2, 16384));
        int iAvailable = dataInputStream.available() / 4;
        this.f27011b = new int[iAvailable];
        for (int i = 0; i < iAvailable; i++) {
            this.f27011b[i] = dataInputStream.readInt();
        }
        dataInputStream.close();
        inputStream2.close();
        return true;
    }

    public List<a> b(String str, int i) {
        List<Integer> listA = this.f27010a.a(str, i, 0, 0);
        ArrayList arrayList = new ArrayList();
        for (Integer num : listA) {
            arrayList.add(new a(num.intValue(), this.f27011b[num.intValue()]));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new a(SpecialWord.UNK_WORD.getIndex(), 1));
        }
        return arrayList;
    }
}
