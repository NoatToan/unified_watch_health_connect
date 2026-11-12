package com.xiaomi.ai.domain.phonecall.util;

import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import defpackage.k12;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class ContactEncryptor {
    private static final Pattern BASE64_PAT;
    private static final List<String> salts;

    static {
        ArrayList arrayList = new ArrayList();
        salts = arrayList;
        BASE64_PAT = Pattern.compile("^[A-Za-z0-9+/=_-]+$");
        arrayList.addAll(Arrays.asList("03f72e9d-a8e6-4dc7-bb0e-0a3e092b6490", "8c518753-fa19-46da-8b38-f12eb50866dd", "56ee0d25-24d5-40bc-8a76-88dc5e088137", "9e72ab60-fa1e-4ff3-ac12-b2dfef14312f", "5afbb6f1-000d-4ff3-9b18-97e2fc0bf750", "9ba3d6fb-eda5-4e70-a849-72e1b3f1406f", "a77da77b-7a34-4dbf-aa57-388d3a43dac0", "76c9a3ef-04ed-4ff5-819e-1138dbee4d8e", "22a2419c-e35f-4369-9e3e-c1a1f3393acb", "82ff1e4b-bc0c-4d82-909e-6fb9d7f6dd68", "d34dab6c-f8c7-4422-aa98-80e3466f74e7", "0d0078ce-6baf-4d14-9faf-d803da8bdfa2", "c698af47-7cee-4c0d-87cf-84f4ed632ffb", "006ce89c-b51e-4365-8ee9-2e2c145cd899", "38df4d3f-b74e-46d7-a520-10f24f86e102", "c289a917-4f28-4d8c-92e4-03d6f913f5f0", "2eb314ed-e23d-4d93-b8db-2b6ef9dc9072", "76ae3b2f-80df-4186-8d59-c4f2e60d4e64", "a4bb17d6-85ac-4bc0-83a2-9dc14acc20a8", "dedb472b-43ed-47d3-bec9-05ba33510cfd", "fa1701d1-77f1-4c4d-a842-4ad93218d524", "08fc16e4-49f6-49b3-ba3c-c22acab8a15a", "5d40fbb5-0db7-4ce9-b37e-e04e9cb6c72a", "841104a6-97ec-485f-a025-32d02d4aeaea", "ba9d6844-ebb4-4bca-ae82-9f1036e973b9", "c0391858-d84c-4e1a-b4ae-43bab8167915", "ad35ffc2-6536-4576-a77c-9ba7d9161bef", "6ed3f62f-e278-4f6f-aa7d-78bfc5a29702", "f9945e80-c467-43d7-bbbd-bba0492573d0", "dcec4acd-1eed-434e-96d1-e16f1b418355", "40d53db4-320f-45e2-a0c0-fb10b682e494", "e1f7a155-8e9a-410d-9f56-e5148a30b627", "ce3448f9-8175-41e0-b9db-c39a34c303a7", "3157aac8-2269-476f-bc0a-777812b297db", "d8e0eeb1-09c7-497c-b140-e535a9abc719", "d9f7f95d-ce55-41c5-ba23-70f4e481d909", "9aa325bb-067e-4644-9946-bed5a12c072d", "c265625a-12a4-4eef-af19-3d57db682d89", "4c8d75b7-16b4-4fed-b369-e8a3ed5d0066", "95cef322-2bb3-4af0-90fb-2933c4934736", "d5a2a4b8-1233-4cb0-910a-54ca69b244dd", "a9eb18bd-a60c-4782-b110-bbf2f3ef7f1b", "2a0d3745-f214-4528-b4e5-34f41e79e38d", "45479a87-7825-4061-8624-03831da4f727", "e61a96e5-bdb6-416d-a89a-797d1b7f4b7e", "cab7bc45-5524-43ec-a0fb-b1410a758295", "65fcecf8-ccc8-43a1-acb9-b3656da89024", "c67c89a1-b0f4-4c2d-a6e0-ae7337d26c80", "bb1c1f17-d46d-4b56-8a62-be59194ea6e7", "a09ac5d7-2712-4386-b127-c30dd245e895", "717ba83c-d6e3-4f25-8d19-10623c2b67ad", "a46b37b3-4067-4b9f-9f93-3ed4d5636e1c", "75efbf8c-8e07-40f8-a75a-6e7d3de24005", "5ff16d4e-a839-4296-822f-fbad8e94e053", "950a3b51-f019-491e-abc4-c8290e2d9e3d", "c84eca40-36b1-425f-a71a-cdad6bc0ee91", "966abec4-8a31-499f-a88c-f3d535cd15e2", "367990aa-9409-49c1-a2e4-1fb245c57a97", "b549fc29-8b59-4777-8546-93005a8932e6", "aad82ca2-766a-45bc-8376-dc894622b577", "e1ad259b-4dd5-4cb4-bbfc-2c5e4e8fb18c", "09f5996f-bf24-42ec-9513-205c194df2cf", "0b7d1170-fb31-42f1-966b-4692d47eab5a", "eefe37e9-f33d-4039-bd3a-3a4e04c5e7eb", "3fdec613-e560-424f-a934-2589eeca798e", "f16a97c1-d7fa-4428-8a18-9e37d44a7038", "e6eff9d4-ac61-44de-969f-78043130ac69", "6d8833f1-138e-4719-a7e3-00553aa50649", "5054d7e9-19be-460a-88f2-d275941dee01", "0f5c1038-9597-4070-8391-b2c0372ffc68", "2d3f05a4-fbb8-41bd-9859-df1b4ed684bc", "0adf5af4-d465-4392-ba32-7498410fde48", "33a91c03-61ed-422a-9478-526e18f1a05e", "ddcd0121-02dd-457f-a63f-61f5328b473b", "26527534-d8e9-47a5-904c-aecc316e3da2", "1d71c218-ea23-4359-b44d-649fba751849", "e3f43055-3f79-450b-aaa2-0994f8d226da", "14561b85-590c-49d9-8d94-6931f768a309", "977447ab-6d3a-4e6c-bdac-51422e66157d", "9ae88070-586b-4fca-8e9d-d0cf2743e26b", "8de42c91-63a9-4bfc-89b6-bd72a395415a", "b20106a3-b535-4f5c-b042-33ac5bbf6f5a", "9aa3d5e9-d474-4c1c-adb0-ee1c1e049414", "580bc201-2532-4daf-9348-442fd58f5049", "2b431d95-8a44-4ceb-808c-71888e3d06b9", "a41330f5-952c-496f-bc52-59713d2803c8", "59503c78-ab76-4810-a0b9-02ffed4c52f7", "733e19ef-e2a8-4882-b477-295fc5307851", "e18491d1-6179-49fc-acb4-eed78235e9dd", "3bb96a95-bbaf-42ba-ada5-d85f79198173", "167a48c7-8a7b-4eb8-9739-db06540d4ba3", "55636685-f7d0-4fd9-86fe-8e5fdb6e3923", "1f953b01-9ab4-4058-ab9d-f26597b71a71", "d2d46c75-cbef-4124-819a-167920fe6a20", "1aac021f-c776-4a04-ad2f-11daf6a1af31", "8af5cb64-7d22-4ca6-84d7-c8224e693f35", "13e03708-f3ee-4682-a012-c0ad38348645", "534d5075-2fcd-47cf-8e07-b634e871a55a", "81bbaa24-760d-4c17-b791-f6abf88f8b6e", "2abec0ba-49ac-4cf4-9217-479ac7e60ae0"));
    }

    public static String decrypt(String str, String str2, String str3) throws Exception {
        SecretKeySpec secretKeySpecGenKey = genKey(str2, str3);
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(2, secretKeySpecGenKey);
        return new String(cipher.doFinal(k12.a(str, 10)));
    }

    public static String encrypt(String str, String str2, String str3) throws Exception {
        SecretKeySpec secretKeySpecGenKey = genKey(str2, str3);
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(1, secretKeySpecGenKey);
        return k12.f(cipher.doFinal(str.getBytes()), 10);
    }

    private static SecretKeySpec genKey(String str, String str2) throws NoSuchAlgorithmException {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int iAbs = Math.abs((str + "-" + str2).hashCode());
        List<String> list = salts;
        int size = iAbs % list.size();
        MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
        messageDigest.reset();
        messageDigest.update((list.get(size) + "-" + str + "-" + str2).getBytes());
        return new SecretKeySpec(messageDigest.digest(), "AES");
    }

    public static boolean isBase64(String str) {
        return BASE64_PAT.matcher(str).matches();
    }
}
