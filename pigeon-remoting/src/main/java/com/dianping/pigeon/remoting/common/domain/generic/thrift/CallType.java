/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.dianping.pigeon.remoting.common.domain.generic.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum CallType implements TEnum {
  Reply(0),
  NoReply(1);

  private final int value;

  private CallType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static CallType findByValue(int value) { 
    switch (value) {
      case 0:
        return Reply;
      case 1:
        return NoReply;
      default:
        return null;
    }
  }
}