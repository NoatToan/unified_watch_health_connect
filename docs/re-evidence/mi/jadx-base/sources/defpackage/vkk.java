package defpackage;

import com.google.typography.font.sfntly.Font;
import com.google.typography.font.sfntly.a;
import java.util.HashSet;

/* JADX INFO: loaded from: classes5.dex */
public class vkk extends ooo {
    public vkk(Font font, a aVar) {
        super(font, aVar);
        HashSet hashSet = new HashSet();
        hashSet.add(new v0b());
        hashSet.add(new ukk());
        hashSet.add(new y4i());
        hashSet.add(new pac());
        this.c = hashSet;
    }

    @Override // defpackage.ooo
    public void f(Font.b bVar) {
        int i = tzo.d;
        bVar.l(i, this.f29345a.h(i).f());
        int i2 = tzo.f;
        bVar.l(i2, this.f29345a.h(i2).f());
    }
}
