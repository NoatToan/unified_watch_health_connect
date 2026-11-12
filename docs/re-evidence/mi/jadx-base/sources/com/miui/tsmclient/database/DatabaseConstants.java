package com.miui.tsmclient.database;

import android.net.Uri;
import android.provider.BaseColumns;

/* JADX INFO: loaded from: classes4.dex */
public class DatabaseConstants {
    public static final String AUTHORITY = ProviderAuthorities.AUTHORITY;
    public static final String CACHE_KEY_PRODUCT_PREFFIX = "product_";
    public static final Uri CONTENT_URI;
    public static final Uri CONTENT_URI_BANK_BIN;
    public static final Uri CONTENT_URI_BANK_INFO;
    public static final Uri CONTENT_URI_CACHE;
    public static final Uri CONTENT_URI_DATA_STAT;
    public static final Uri CONTENT_URI_NO_PROMPT_BULLETIN;
    public static final Uri CONTENT_URI_TRANS_CARD_INFO;
    public static final Uri CONTENT_URI_TRAVEL_INFO;
    public static final String PRODUCT_NAME = "product_name";
    public static final String[] PROJECTION_BANK_NAME_AND_LOGO;
    public static final String[] PROJECTION_CACHE;
    public static final String[] PROJECTION_DATA_STAT_INFO;
    public static final String[] PROJECTION_TRANS_CARD_INFO;
    public static final String[] PROJECTION_TRAVEL_INFO;
    public static final Uri PUBLIC_CONTENT_URI;
    public static final String TABLE_BANK_BIN = "bank_bin";
    public static final String TABLE_BANK_INFO = "bank_info";
    public static final String TABLE_CACHE = "cache";
    public static final String TABLE_DATA_STAT = "data_stat";
    public static final String TABLE_NO_PROMPT_BULLETIN = "no_prompt_bulletin";
    public static final String TABLE_TRANS_CARD_INFO = "trans_card_info";
    public static final String TABLE_TRAVEL_INFO = "travel_info";

    public static final class BankBinTable implements BaseColumns {
        public static final String COLUMN_BANK_NAME = "bank_name";
        public static final String COLUMN_BIN_CODE = "bin_code";
        public static final String COLUMN_CARD_TYPE = "card_type";
    }

    public static final class BankInfoTable implements BaseColumns {
        public static final String COLUMN_BANK_CODE = "bank_code";
        public static final String COLUMN_BANK_ID = "bank_id";
        public static final String COLUMN_BANK_LOGO = "bank_logo";
        public static final String COLUMN_BANK_NAME = "bank_name";
    }

    public static final class CacheTable implements BaseColumns {
        public static final String COLUMN_DEVICE = "device";
        public static final String COLUMN_KEY = "key";
        public static final String COLUMN_VALUE = "value";
    }

    public static final class DataStatTable implements BaseColumns {
        public static final String COLUMN_DATA_ID = "data_id";
        public static final String COLUMN_DATA_TIME = "data_time";
        public static final String COLUMN_DATA_VALUE = "data_value";
    }

    public static final class NoPromptBulletinTable implements BaseColumns {
        public static final String COLUMN_BULLETIN_ID = "bulletin_id";
    }

    public static final class TransCardInfoTable implements BaseColumns {
        public static final String COLUMN_CARD_CODE = "card_code";
        public static final String COLUMN_CARD_ID = "card_id";
        public static final String COLUMN_CARD_LOGO = "card_logo";
        public static final String COLUMN_CARD_NAME = "card_name";
        public static final String COLUMN_ISSUABLE = "issuable";
    }

    public static final class TravelInfoTable implements BaseColumns {
        public static final String COLUMN_CARD_NAME = "card_name";
        public static final String COLUMN_KEY = "key";
        public static final String COLUMN_VALUE = "value";
    }

    static {
        Uri uri = ProviderAuthorities.CONTENT_URI;
        CONTENT_URI = uri;
        PUBLIC_CONTENT_URI = ProviderAuthorities.PUBLIC_CONTENT_URI;
        PROJECTION_CACHE = new String[]{"key", "value"};
        PROJECTION_BANK_NAME_AND_LOGO = new String[]{"bank_info.bank_name", BankInfoTable.COLUMN_BANK_LOGO};
        PROJECTION_TRANS_CARD_INFO = new String[]{"card_name", TransCardInfoTable.COLUMN_CARD_LOGO, TransCardInfoTable.COLUMN_ISSUABLE, TransCardInfoTable.COLUMN_CARD_CODE};
        PROJECTION_DATA_STAT_INFO = new String[]{DataStatTable.COLUMN_DATA_ID, DataStatTable.COLUMN_DATA_VALUE, DataStatTable.COLUMN_DATA_TIME};
        PROJECTION_TRAVEL_INFO = new String[]{"key", "card_name", "value"};
        CONTENT_URI_CACHE = Uri.parse(uri + "/" + TABLE_CACHE);
        CONTENT_URI_BANK_BIN = Uri.parse(uri + "/bank_bin");
        CONTENT_URI_BANK_INFO = Uri.parse(uri + "/bank_info");
        CONTENT_URI_TRANS_CARD_INFO = Uri.parse(uri + "/trans_card_info");
        CONTENT_URI_NO_PROMPT_BULLETIN = Uri.parse(uri + "/" + TABLE_NO_PROMPT_BULLETIN);
        CONTENT_URI_DATA_STAT = Uri.parse(uri + "/" + TABLE_DATA_STAT);
        CONTENT_URI_TRAVEL_INFO = Uri.parse(uri + "/travel_info");
    }
}
