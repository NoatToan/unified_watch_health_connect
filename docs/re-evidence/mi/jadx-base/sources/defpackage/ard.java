package defpackage;

import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.xiaomi.common.Optional;
import com.xiaomi.ext.Jdk8OptionalBeanPropertyWriter;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ard extends lh2 {
    @Override // defpackage.lh2
    public List<BeanPropertyWriter> a(SerializationConfig serializationConfig, fh2 fh2Var, List<BeanPropertyWriter> list) {
        for (int i = 0; i < list.size(); i++) {
            BeanPropertyWriter beanPropertyWriter = list.get(i);
            if (beanPropertyWriter.getType().isTypeOrSubTypeOf(Optional.class)) {
                list.set(i, new Jdk8OptionalBeanPropertyWriter(beanPropertyWriter, Optional.a()));
            }
        }
        return list;
    }
}
